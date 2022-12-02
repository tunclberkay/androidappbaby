package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ay10dashbourd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ay10dashbourd);

        setContentView(R.layout.activity_ay1dashbourd);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.black);

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
    public void foto2(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay10oyuncak.class);
        startActivity(ıntent);
    }
    public void foto3(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay10asi.class);
        startActivity(ıntent);

    }
    public void foto5(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay10beslenme.class);
        startActivity(ıntent);
    }
    public void foto9(View view){
        Intent ıntent = new Intent(getApplicationContext(), homepage.class);
        startActivity(ıntent);


    }
}