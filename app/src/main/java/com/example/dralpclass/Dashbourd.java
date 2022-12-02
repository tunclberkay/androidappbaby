package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Random;

public class Dashbourd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbourd);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.dashbourd);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.dashbourd:
                        startActivity(new Intent(getApplicationContext()
                                ,Dashbourd.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,SplashActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                ,kiloboytercih.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });

    }
    public void button2(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru1.class);
        startActivity(ıntent);

    }
    public void button3(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru2.class);
        startActivity(ıntent);

    }
    public void button4(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru3.class);
        startActivity(ıntent);

    }
    public void button5(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru4.class);
        startActivity(ıntent);

    }
    public void button6(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru5.class);
        startActivity(ıntent);

    }
    public void button7(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru6.class);
        startActivity(ıntent);

    }
    public void button8(View view){
        Intent ıntent = new Intent(getApplicationContext(), soru7.class);
        startActivity(ıntent);


    }
}
