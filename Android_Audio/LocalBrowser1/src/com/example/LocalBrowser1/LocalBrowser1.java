package com.example.LocalBrowser1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
/**
 * 7.3 JavaScript与Java通信
 */
public class LocalBrowser1 extends Activity {
    private static final String TAG = "LocalBrowser1";
    private final Handler handler = new Handler();//安排消息或Runnable在线程中执行
    private WebView webView;
    private TextView textView;
    private Button button;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        webView = (WebView) findViewById(R.id.web_view);
        textView = (TextView) findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button);

        webView.getSettings().setJavaScriptEnabled(true);
        //将java对象注入WebView
        webView.addJavascriptInterface(new AndroidBridge(), "android");
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                Log.d(TAG, "onJsALert(" + view + ", " + url + ", " + message + ", " + result + ")");
                Toast.makeText(LocalBrowser1.this, message, 3000).show();
                result.confirm();
                return true;//I handler it
            }
        });
        webView.loadUrl("file:///android_asset/index.html");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "OnClick(" + view + ")");
                webView.loadUrl("javascript:callJS('Hello  from android')");
            }
        });
    }

    private class AndroidBridge {
        public void callAndroid(final String arg) {//must be final
            handler.post(new Runnable() {
                @Override
                public void run() {
                    Log.d(TAG, "callAndroid(" + arg + ")");
                    textView.setText(arg);
                }
            });
        }
    }

}
