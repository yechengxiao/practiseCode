package com.example.Translate;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-8-22
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
public class TranslateTask implements Runnable {
    private static final String TAG = "TranslateTask";
    private final Translate translate;
    private final String original, from, to;

    public TranslateTask(Translate translate, String original, String from, String to) {
        this.translate = translate;
        this.original = original;
        this.from = from;
        this.to = to;
    }

    public void run() {
        String trans = doTranslate(original, from, to);
        translate.setTranslated(trans);
        String retrans = doTranslate(trans, to, from);
        translate.setRetranslated(retrans);
    }

    private String doTranslate(String original, String from, String to) {
        String result = translate.getResources().getString(R.string.translation_error);
        HttpURLConnection con = null;
        Log.d(TAG, "doTranslate(" + original + ", " + from + ", " + to + ")");

        try {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            String q = URLEncoder.encode(original, "UTF-8");
            //http://ajax.googleapis.com/ajax/services/language/translate?v=1.0&langpair=zh-CN|en&q=中国人是好人  %7C 转义 “\|”
            //v1停用，v2要付费
            URL url = new URL("http://ajax.googleapis.com/ajax/services/language/translate" + "?v=1.0" + "&q=" + q + "&langpair=" + from + "%7C" + to);
            con = (HttpURLConnection) url.openConnection();
            con.setReadTimeout(10000);
            con.setConnectTimeout(15000);
            con.setRequestMethod("GET");
            con.addRequestProperty("Referer", "http://www.pragprong.com/titles/ebande/hello-android");
            con.setDoInput(true);
            //start query
            con.connect();

            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String payload = reader.readLine();
            reader.close();

            JSONObject jsonObject = new JSONObject(payload);
            result = jsonObject.getJSONObject("responseData")
                    .getString("translatedText")
                    .replace("&#39;", "'")
                    .replace("&amp;", "&");
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        } catch (InterruptedException e) {


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JSONException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
        Log.d(TAG, "-->returned " + result);
        return result;
    }
}
