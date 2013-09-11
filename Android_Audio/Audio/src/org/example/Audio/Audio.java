package org.example.Audio;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

/**
 * 5.1 播放音频
 */
public class Audio extends Activity {
    private MediaPlayer mp;
    private String TAG = "Audio";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //在该应用程序运行时如果用户按下了音量增加或音量降低键，它应该调整音乐或其他媒体的音量，而不是铃声的音量。
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }

    //截获按键事件并播放适当的声音
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        int resId;
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_UP:
                resId = R.raw.up;
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                resId = R.raw.down;
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                resId = R.raw.left;
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                resId = R.raw.right;
                break;
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
                Log.d(TAG, "KEYCODE_ENTER");
                resId = R.raw.enter;
                break;
            case KeyEvent.KEYCODE_A:
                resId = R.raw.a;
                break;
            case KeyEvent.KEYCODE_S:
                resId = R.raw.s;
                break;
            case KeyEvent.KEYCODE_D:
                resId = R.raw.d;
                break;
            case KeyEvent.KEYCODE_F:
                resId = R.raw.f;
                break;
            default:
                return super.onKeyDown(keyCode, event);
        }
        // Release any resources from previous MediaPlayer
        if (mp != null) {
            //停止任何已经播放的声音并释放与旧MediaPlayer类关联的所有资源。如果忘记了这一步，程序就会崩溃
            mp.release();
        }
        // 通过选中的声音资源创建一个新的MediaPlayer类，并调用start()方法开始播放。
        mp = MediaPlayer.create(this, resId);
        mp.start();
        return true;
    }

}
