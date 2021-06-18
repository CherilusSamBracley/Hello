package com.example.hello.extra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hello.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu_icon;

    NavigationView NavigationViewP;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout= findViewById(R.id.drawer_l);
        menu_icon= findViewById(R.id.menu_button);

        menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        NavigationViewP = findViewById(R.id.NavigationViewP);

        NavigationViewP.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.item_one_nv:
                        Intent intent_one= new Intent(MainActivity.this, Dashboard_Activity.class);
                        startActivity(intent_one);
                        break;

                    case R.id.item_two_nv:
                        Intent intent_two= new Intent(MainActivity.this, Course_Activity.class);
                        startActivity(intent_two);
                        break;

                    case R.id.item_three_nv:
                        Intent intent_three= new Intent(MainActivity.this, Homework_Activity.class);
                        startActivity(intent_three);
                        break;


                    case R.id.item_four_nv:
                        Intent intent_four= new Intent(MainActivity.this, AwardPage_Activity.class);
                        startActivity(intent_four);
                        break;


                    case R.id.item_five_nv:
                        Intent intent_fifth= new Intent(MainActivity.this, Meeting_Activity.class);
                        startActivity(intent_fifth);
                        break;

                    case R.id.item_six_nv:
                        Intent intent_six= new Intent(MainActivity.this, Notification_Activity.class);
                        startActivity(intent_six);
                        break;


                    case R.id.item_seven_nv:
                        Intent intent_seven = new Intent(MainActivity.this, HelpCenter_Activity.class);
                        startActivity(intent_seven);
                        break;

                    case R.id.item_height_nv:
                        Toast.makeText(MainActivity.this, "You are out...", Toast.LENGTH_SHORT).show();


                    case R.id.item_nine_nv:
                        Toast.makeText(MainActivity.this, "This is admin selection", Toast.LENGTH_SHORT).show();

                }
                return true;
            }
        });


        bottomNavigationView= findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.item_one_bnv:
                        Intent intent_one= new Intent(MainActivity.this, Course_Activity.class);
                        startActivity(intent_one);
                        break;


                    case R.id.item_two_bnv:
                        Intent intent_two= new Intent(MainActivity.this, HelpCenter_Activity.class);
                        startActivity(intent_two);
                        break;


                    case R.id.item_three_bnv:
                        Intent intent_three= new Intent(MainActivity.this, Notification_Activity.class);
                        startActivity(intent_three);
                        break;
                }
                return true;
            }
        });

    }
}