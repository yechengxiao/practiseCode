package com.example.BrowseIntent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * 7.1 通过意图实现浏览网页
 */
public class BrowseIntent extends Activity {
    private EditText urlText;
    private Button goButton;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);//根据布局资源中的视图定义来加载视图

        //Get a handle to all user interface elements
        //获取句柄
        urlText = (EditText) findViewById(R.id.url_field);
        goButton = (Button) findViewById(R.id.go_button);
        //Setup event handlers
        //设置事件句柄
        goButton.setOnClickListener(new View.OnClickListener() {
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
        //http://必须有
        String url = urlText.getText().toString();
        if (!"http".equals(url.substring(0, 4))) {
            url = "http://" + url;
        }
        Uri uri = Uri.parse(url);//获取网址，并转换成URI
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);//打开浏览器
        startActivity(intent);
    }
}
