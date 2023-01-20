package com.example.pgrb4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.util.Log;

public class MyService extends Service {
    MediaPlayer player;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate(){
        player = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        player.start();
        player.setLooping(false);
    }
    @Override
    public void onDestroy(){
        player.stop();
    }
}