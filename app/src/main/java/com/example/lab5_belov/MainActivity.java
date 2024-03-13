package com.example.lab5_belov;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    {
        VideoView MyvideoPlayer;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            MyvideoPlayer = (VideoView)findViewById(R.id.videoView);
            Uri myVideoUri = Uri.parse("android.resource://" +
                    getPackageName() + "/"
                    + R.raw.video_file);
            MyvideoPlayer.setVideoURI(myVideoUri);
            MediaController mediaController = new MediaController(this);
            MyvideoPlayer.setMediaController(mediaController);
            mediaController.setMediaPlayer(MyvideoPlayer);
        }}

    public void onStartClick(View view)
    {
        MyvideoPlayer.start();
    }
    public void onPauseClick(View view)
    {
        MyvideoPlayer.pause();
    }
    public void onStopClick(View view) {
        MyvideoPlayer.stopPlayback();
        MyvideoPlayer.resume();
    }


}