package com.example.meghneelgore.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView start;
    TextView end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (TextView) findViewById(R.id.start);
        end = (TextView) findViewById(R.id.end);

        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), DownloadService.class);
                startService(i);
            }
        });


        end.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), DownloadService.class);
                stopService(i);
            }
        });
    }
}
