package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class kiloboytercih extends AppCompatActivity {


    String typeofuser="0";
    RelativeLayout mmale,mfemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiloboytercih);

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
                                ,ay1dashbourd.class));
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


        mmale=findViewById(R.id.male);
        mfemale=findViewById(R.id.female);


        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser="Male";
            }
        });

        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser="Female";
            }
        });

    }
    public void button11(View view){

        if(typeofuser.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Lütfen Cinsiyet Seçiniz",Toast.LENGTH_SHORT).show();
        }
        else if(typeofuser.equals("Male") || typeofuser.equals("Female")) {
            Intent ıntent = new Intent(getApplicationContext(), boyhesaplama.class);
            startActivity(ıntent);

        }
    }

    public void button12(View view){

        if(typeofuser.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Lütfen Cinsiyet Seçiniz",Toast.LENGTH_SHORT).show();
        }
        else if(typeofuser.equals("Female")|| typeofuser.equals("Male")){

            Intent ıntent = new Intent(getApplicationContext(), ay12asi.class);
            startActivity(ıntent);

        }

    }
}