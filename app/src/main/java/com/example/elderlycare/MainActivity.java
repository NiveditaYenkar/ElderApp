package com.example.elderlycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.logo);

        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(4 * 1000);
                    Intent i = new Intent(getBaseContext(), home.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }
            }
        };
        background.start();

    }
}