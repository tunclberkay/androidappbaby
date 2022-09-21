package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ay7dashbourd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ay7dashbourd);

        setContentView(R.layout.activity_ay1dashbourd);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

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
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                ,Dashbourd2.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });



    }
    public void foto2(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay7oyuncak.class);
        startActivity(ıntent);
    }
    public void foto3(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay7asi.class);
        startActivity(ıntent);

    }
    public void foto5(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay7beslenme.class);
        startActivity(ıntent);
    }
}