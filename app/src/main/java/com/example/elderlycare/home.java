package com.example.elderlycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public void exe(View view) {

        Intent i = new Intent(home.this, exe.class);
        startActivity(i);
    }
    public void spirit(View view) {

        Intent i = new Intent(home.this, spirit.class);
        startActivity(i);
    }
    public void diet(View view) {

        Intent i = new Intent(home.this, die.class);
        startActivity(i);
    }
    public void expert(View view) {

        Intent i = new Intent(home.this, expert.class);
        startActivity(i);
    }
    public void remind(View view) {

        Intent i = new Intent(home.this, remind.class);
        startActivity(i);
    }
    public void remedy(View view) {

        Intent i = new Intent(home.this, remedy.class);
        startActivity(i);
    }
    public void die(View view) {

        Intent i = new Intent(home.this, die.class);
        startActivity(i);
    }
}
