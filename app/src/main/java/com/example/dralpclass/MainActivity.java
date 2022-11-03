package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
    public void foto1(View view){
        Intent ıntent = new Intent(getApplicationContext(), homepage.class);
        startActivity(ıntent);
    }
    public void foto4(View view){
        Intent ıntent = new Intent(getApplicationContext(), iletisim.class);
        startActivity(ıntent);
    }
    public void foto3(View view){
        Intent ıntent = new Intent(getApplicationContext(), whitesound.class);
        startActivity(ıntent);
    }
    public void foto2(View view){
        Intent ıntent = new Intent(getApplicationContext(), ekgida.class);
        startActivity(ıntent);
    }
}