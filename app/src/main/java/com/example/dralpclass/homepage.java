package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

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
                                ,MainActivity.class));
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
    public void foto1(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay1dashbourd.class);
        startActivity(ıntent);

    }
    public void foto2(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay2dashbourd.class);
        startActivity(ıntent);

    }
    public void foto3(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay3dashbourd.class);
        startActivity(ıntent);
    }
    public void foto4(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay1dashbourd.class);
        startActivity(ıntent);

    }
    public void foto5(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay1dashbourd.class);
        startActivity(ıntent);

    }
    public void foto6(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay1dashbourd.class);
        startActivity(ıntent);

    }
    public void foto7(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay7dashbourd.class);
        startActivity(ıntent);

    }
    public void foto8(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay8dashbourd.class);
        startActivity(ıntent);
    }
    public void foto9(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay9dashbourd.class);
        startActivity(ıntent);
    }
    public void foto10(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay10dashbourd.class);
        startActivity(ıntent);
    }
    public void foto11(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay11dashbourd.class);
        startActivity(ıntent);
    }
    public void foto12(View view){
        Intent ıntent = new Intent(getApplicationContext(), ay12dashbourd.class);
        startActivity(ıntent);



    }
}