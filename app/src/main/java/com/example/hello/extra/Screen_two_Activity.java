package com.example.hello.extra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hello.R;

public class Screen_two_Activity extends AppCompatActivity {
    ConstraintLayout screen_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two_);

        screen_two= findViewById(R.id.screen_two);


        screen_two.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intentThirdPage = new Intent(Screen_two_Activity.this, Screen_three_Activity.class);
                startActivity(intentThirdPage);
                return true;
            }
        });
    }
}