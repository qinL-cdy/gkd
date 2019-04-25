package com.example.cwjjun.example1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class catelog1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catelog1);
        play_mp4();
        /*        try {
                    play_rtsp();
                } catch (IOException e){
                    Log.d("videoplay", "videoview: IOException");
                    e.printStackTrace();//        }*/

    }
    private void play_mp4(){
        String videoUrl1 = "https://gslb.miaopai.com/stream/P4DnrjGZ7PzC2LfQK9k2cAKEIw39GiixIBpIHA__.mp4";
        Uri uri = Uri.parse( videoUrl1 );
        VideoView videoView = this.findViewById(R.id.video1);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();
    }
    /*private void play_rtsp() throws IOException {
        String videoUrl2 = "rtsp://192.168.110.227:1935/vod/sample.mp4" ;
        Uri uri = Uri.parse( videoUrl2 );
        videoView = (VideoView)this.findViewById(R.id.video1 );
        //videoView.setVideoPath(path);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }*/
}
