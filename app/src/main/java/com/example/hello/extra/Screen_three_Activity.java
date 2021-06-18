package com.example.hello.extra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hello.R;

public class Screen_three_Activity extends AppCompatActivity {

    ConstraintLayout screen_three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three_);

        screen_three = findViewById(R.id.screen_three);


        screen_three.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intentMainPage = new Intent(Screen_three_Activity.this, MainActivity.class);
                startActivity(intentMainPage);
                return true;

            }

        });
    }
}