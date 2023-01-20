package com.example.pgrb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnstart;
    Button btnstop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart = (Button) findViewById(R.id.play);
        btnstop = (Button) findViewById(R.id.stop);
        btnstart.setOnClickListener(this);
        btnstop.setOnClickListener(this);
    }
    public void onClick(View scr){
        switch (scr.getId())
        {
            case R.id.play:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.stop:
                stopService(new Intent(this, MyService.class));
                break;
        }
    }
}