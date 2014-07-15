package com.example.Translate;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 7.4 使用web服务
 * 在manifest中声明网络权限
 * Google Translate API is a paid service. 没得用了
 */
public class Translate extends Activity {
    private Spinner fromSpinner;//下拉菜单
    private Spinner toSpinner;
    private EditText origText;//用户输入语言
    private TextView transText;//翻译后的
    private TextView reTranText;//翻译成输入的，最好情况是和输入时保持一致
    //?
    private TextWatcher textWatcher;
    private AdapterView.OnItemSelectedListener itemListener;
    //?
    private Handler guiThread;//主线程
    private ExecutorService transThread;//翻译线程
    private Runnable updateTask;//更新任务
    private Future transPending;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initThreading();//更新请求
        findViews();
        setAdapters();
        setListeners();
    }

    private void findViews() {
        fromSpinner = (Spinner) findViewById(R.id.from_language);
        toSpinner = (Spinner) findViewById(R.id.to_language);
        origText = (EditText) findViewById(R.id.original_text);
        transText = (TextView) findViewById(R.id.translated_text);
        reTranText = (TextView) findViewById(R.id.retranslated_text);
    }

    //为微调控制项定义了数据源：
    private void setAdapters() {
        //Spinner list comes from a resource,
        //Spinner user interface uses standard layouts
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
        //Automatically select tow spinner items
        fromSpinner.setSelection(0);//zh_CN
        toSpinner.setSelection(2);//en
    }

    private void setListeners() {
        //Define event listeners
        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                queueUpdate(1000);//毫秒
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //do nothing
            }
        };
        itemListener = new

                AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        queueUpdate(200);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        //do nothig
                    }
                };
        origText.addTextChangedListener(textWatcher);//监听是否输入发生改变
        fromSpinner.setOnItemSelectedListener(itemListener);//监听选项是否改变;
        toSpinner.setOnItemSelectedListener(itemListener);
    }

    //更新请求
    private void initThreading() {
        guiThread = new Handler();//主线程
        transThread = Executors.newSingleThreadExecutor();//翻译线程
        //This task does a translation and updates the screen
        updateTask = new Runnable() {
            @Override
            public void run() {
                //Get text to translate
                String original = origText.getText().toString().trim();
                //Cancel previous translation if there was one
                if (transPending != null) {
                    transPending.cancel(true);
                }
                //Take care of the easy case
                if (original.length() == 0) {
                    transText.setText(R.string.empty);
                    reTranText.setText(R.string.empty);
                } else {
                    //Let user know we're dong something
                    transText.setText(R.string.translating);
                    reTranText.setText(R.string.translating);
                    //Begin translation now but don't wait for it
                    try {
                        TranslateTask translateTask = new TranslateTask(
                                Translate.this,//regerence to activity
                                original,//original text
                                getLang(fromSpinner),
                                getLang(toSpinner)
                        );
                        transPending = transThread.submit(translateTask);
                    } catch (Exception e) {
                        //unable to start new task
                        transText.setText(R.string.translation_error);
                        reTranText.setText(R.string.translation_error);
                    }
                }
            }
        };
    }

    //Extract the laguage code from the curent spinner item
    private String getLang(Spinner spinner) {
        String result = spinner.getSelectedItem().toString();
        int lparen = result.indexOf(('('));
        int rparen = result.indexOf(')');
        result = result.substring(lparen + 1, rparen);
        return result;
    }

    //Request an update to start after a short delay
    private void queueUpdate(long delayMillis) {
        //cancel previous update if it hasnt started yet
        guiThread.removeCallbacks(updateTask);
        //Start an update if nothing happens after a few milliseconds
        guiThread.postDelayed(updateTask, delayMillis);
    }

    //modify text on the screen(called from another thread)
    public void setTranslated(String text) {
        guiSetText(transText, text);
    }

    //modify text on the screen(called from another thread)
    public void setRetranslated(String text) {
        guiSetText(reTranText, text);
    }

    //All changes to the GUI must be done in the GUI thread
    private void guiSetText(final TextView view, final String text) {
        guiThread.post(new Runnable() {//要求主线程更新
            public void run() {
                view.setText(text);
            }
        });
    }

}
