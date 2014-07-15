package com.example.BrowserView;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

/**
 * 7.2 利用视图打开网页
 */
public class BrowserView extends Activity {
    private EditText urlText;
    private Button go_button;
    private WebView webView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        webView = (WebView) findViewById(R.id.web_view);
        urlText = (EditText) findViewById(R.id.url_field);
        go_button = (Button) findViewById(R.id.go_button);

        go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBrowser();
            }
        });
        urlText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    openBrowser();
                    return true;
                }
                return false;
            }
        });
    }

    /**
     * Open a browser on the URL specified in the text box
     */
    private void openBrowser() {
        String url = urlText.getText().toString();

        if (!"http".equals(url)) {
            url = "http://" + url;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

}
