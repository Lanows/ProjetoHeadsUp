package com.example.projetoheadsup;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TelaInfo3 extends AppCompatActivity {

    private VideoView mVideoView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_info3);

        // Get a reference to the VideoView

        mVideoView = findViewById(R.id.videoView);

        // Add a Media controller to allow forward/reverse/pause/resume

        final MediaController mMediaController = new MediaController(
                TelaInfo3.this, true);

        mMediaController.setEnabled(false);

        mVideoView.setMediaController(mMediaController);

        mVideoView
                .setVideoURI(Uri
                        .parse("android.resource://" + getPackageName() + "/raw/moon"));


        // Add an OnPreparedListener to enable the MediaController once the video is ready
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                mMediaController.setEnabled(true);
            }
        });
    }

    // Clean up and release resources
    @Override
    protected void onPause() {

        if (mVideoView != null && mVideoView.isPlaying()) {
            mVideoView.stopPlayback();
            mVideoView = null;
        }
        super.onPause();
    }
}