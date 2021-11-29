package com.example.elderlycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class remedy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedy);
    }
    public void cough(View view) {

        Intent i = new Intent(remedy.this, cough.class);
        startActivity(i);
    }
    public void headache(View view) {

        Intent i = new Intent(remedy.this, headache.class);
        startActivity(i);
    }
    public void knee(View view) {

        Intent i = new Intent(remedy.this, knee.class);
        startActivity(i);
    }
    public void backpain(View view) {

        Intent i = new Intent(remedy.this, backpain.class);
        startActivity(i);
    }
}