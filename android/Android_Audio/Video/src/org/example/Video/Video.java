package org.example.Video;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

/**
 * 5.2 播放视频
 */
public class Video extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Fill view from resource
        setContentView(R.layout.main);
        VideoView video = (VideoView) findViewById(R.id.video);
        // 首先打开视频文件，在保持其宽高比不变的情况下，根据其所在的容器调整播放画面的大小，然后播放该视频  /data只是用于演示,在实际设备上该目录是受保护的。
        video.setVideoPath("/sdcard/samplevideo.3gp");
        video.start();
    }
}
