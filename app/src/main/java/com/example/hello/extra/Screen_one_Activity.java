package com.example.hello.extra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hello.R;

public class Screen_one_Activity extends AppCompatActivity {

    ConstraintLayout screen_one;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_one_);


        screen_one= findViewById(R.id.screen_one);


        screen_one.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intentSecondPage = new Intent(Screen_one_Activity.this, Screen_two_Activity.class);
                startActivity(intentSecondPage);
                return true;
            }
        });
    }
}