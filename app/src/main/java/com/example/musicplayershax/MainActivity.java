package com.example.musicplayershax;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private SeekBar seekBar;
    private TextView rightTime, leftTime;
    private Button prev, play, next;
    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setUpUi() {
        mediaPlayer = new MediaPlayer();
        seekBar = (SeekBar) findViewById(R.id.seekbarId);
        rightTime = (TextView) findViewById(R.id.time2);
        leftTime = (TextView) findViewById(R.id.time1);
        prev = (Button) findViewById(R.id.btnLeft);
        play = (Button) findViewById(R.id.btnCenter);
        next = (Button) findViewById(R.id.btnRight);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCenter:
                break;
            case R.id.btnLeft:
                break;
            case R.id.btnRight:
                break;
                
        }
    }
}
