package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class boyhesaplama extends AppCompatActivity {

    SeekBar mseekbarforheight;
    TextView mcurrentheight;

    int currentprogress;
    String mintprogress="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyhesaplama);


        mseekbarforheight=findViewById(R.id.seekbarforheight);
        mcurrentheight=findViewById(R.id.currentheight);












        mseekbarforheight.setMax(100);
        mseekbarforheight.setProgress(0);
        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress=progress;
                mintprogress=String.valueOf(currentprogress);
                mcurrentheight.setText(mintprogress);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.about);

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

                        return true;


                }
                return false;
            }
        });

        }
        public void button8(View view){

            double toplam;
            boolean a1,a2,a3,a4;

            double boy= Double.parseDouble(mintprogress);


            a1 = (boy<48.7 );
            a2 = ((boy>48.8 && boy<70.3) );
            a3 = ((boy>=70.3 && boy<82.4) );






            if(mintprogress.equals("0"))
            {
                Toast.makeText(getApplicationContext(),"Boyunu Giriniz",Toast.LENGTH_SHORT).show();
            }

            else if(a1) {

                Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                startActivity(ıntent);


            }

            else if(a2) {

                Intent ıntent = new Intent(getApplicationContext(), ay7asi.class);
                startActivity(ıntent);

            }





    }
}