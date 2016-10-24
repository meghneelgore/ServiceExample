package com.example.meghneelgore.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class DownloadService extends Service {
    public DownloadService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Download started...", Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Download finished...", Toast.LENGTH_LONG).show();

    }
}
