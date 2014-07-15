package com.example.LocalBrowser;

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
public class LocalBrowser extends Activity {
    private static final String TAG = "LocalBrowser";
    private final Handler handler = new Handler();
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

        //Find the Android controls on the screen
        webView = (WebView) findViewById(R.id.web_view);
        textView = (TextView) findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button);
        //Rest of onCreate follows

        //首先打开JavaScript（默认它是关闭的）并注册到JavaScript的桥接
        //Turn on JavaScript in the embedded browser
        webView.getSettings().setJavaScriptEnabled(true);
        //Expose a Java object to JavaScript in the browser
        webView.addJavascriptInterface(new AndroidBridge(), "android");//index.html 21行
        //Set up a function to be called when JavaScript tries
        //to open an alert window
        //创建匿名的 WebChromeClient 对象并用setWebChromeClient()方法注册它
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                Log.d(TAG, "onJsAlert(" + view + ", " + url + ", " + message + "," + result + ")");
                Toast.makeText(LocalBrowser.this, message, 3000).show();
                result.confirm();
                return true;
            }
        });
        //加载本地页面
        webView.loadUrl("file:///android_asset/index.html");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick:" + view + ")");
                webView.loadUrl("javascript:callJS('Hello from Android')");
            }
        });
    }

    /**
     * Object exposed to JavaScript
     * 暴露给JavaScript，从安全性考虑，只能让白名单上的内容通过。
     * 内部类。
     */
    private class AndroidBridge {
        public void callAndroid(final String arg) {//must be final   final???
            handler.post(new Runnable() {//Handler.post()将该对象放到主线程的运行队列中
                public void run() {
                    Log.d(TAG, "callAndroid(" + arg + ")");
                    textView.setText(arg);
                }
            });
        }
    }


}





