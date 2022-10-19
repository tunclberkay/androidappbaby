package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashbourd2 extends AppCompatActivity {


    TextView mcurrentheight;
    TextView mcurrentage,mcurrentweight;
    ImageView mincrementage,mincrementweight,mdecrementweight,mdecremantage;
    SeekBar mseekbarforheight,mseekbarforweight;
    RelativeLayout mmale,mfemale;



    int intweight=55;
    int intage=0;
    int currentprogress;
    String maxvalue="12";
    String mintprogress="0";
    String typeofuser="0";
    String weight2="0";
    String age2="1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbourd2);

        mcurrentage=findViewById(R.id.calculatebmi);
        mcurrentage=findViewById(R.id.currentage);
        mcurrentweight=findViewById(R.id.currentweight);
        mcurrentheight=findViewById(R.id.currentheight);
        mincrementage=findViewById(R.id.incrementage);
        mdecremantage=findViewById(R.id.decrementage);
       // mincrementweight=findViewById(R.id.incrementweight);
      //  mdecrementweight=findViewById(R.id.decrementweight);
        mseekbarforheight=findViewById(R.id.seekbarforheight);
        mseekbarforweight=findViewById(R.id.seekbarforweight);
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


        mseekbarforheight.setMax(150);
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

        mseekbarforweight.setMax(100);
        mseekbarforweight.setProgress(0);
        mseekbarforweight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress=progress;
                weight2=String.valueOf(currentprogress);
                mcurrentweight.setText(weight2);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intage=intage+1;
                age2=String.valueOf(intage);
                mcurrentage.setText(age2);


            }
        });

        mdecremantage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intage=intage-1;
                age2=String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });

        /* mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intweight=intweight+1;
                weight2=String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intweight=intweight-1;
                weight2=String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

*/







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

        double boy= Double.parseDouble(mintprogress);
        double kilo= Double.parseDouble(weight2);

        toplam = kilo + boy ;




        if(typeofuser.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Lütfen Cinsiyet Seçiniz",Toast.LENGTH_SHORT).show();
        }
        else if(mintprogress.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Boyunu Giriniz",Toast.LENGTH_SHORT).show();
        }
        else if(intage==0 || intage <0)
        {
            Toast.makeText(getApplicationContext(),"Kaç aylık olduğunu giriniz",Toast.LENGTH_SHORT).show();
        }
        else if(weight2.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Kilosunu Giriniz",Toast.LENGTH_SHORT).show();
        }

        else if(boy>1 && boy<20) {

            Intent ıntent = new Intent(getApplicationContext(), ay8beslenme.class);
            startActivity(ıntent);

        }
        else if(boy>20 && boy<40){

            Intent ıntent = new Intent(getApplicationContext(), ay9oyuncak.class);
            startActivity(ıntent);
        }
        else if(toplam>150)
        {
            Intent ıntent = new Intent(getApplicationContext(), ay9asi.class);
            startActivity(ıntent);

        }
       




        /*

        if(typeofuser.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Lütfen Cinsiyet Seçiniz",Toast.LENGTH_SHORT).show();
        }
        else if(mintprogress.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Boyunu Giriniz",Toast.LENGTH_SHORT).show();
        }
        else if(intage==0 || intage <0)
        {
            Toast.makeText(getApplicationContext(),"Kaç aylık olduğunu giriniz",Toast.LENGTH_SHORT).show();
        }
        else if(weight2.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Kilosunu Giriniz",Toast.LENGTH_SHORT).show();
        }
        else
        {





            Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
            getIntent().putExtra("gender",typeofuser);
            getIntent().putExtra("height",mintprogress);
            getIntent().putExtra("weight",weight2);
            getIntent().putExtra("age",age2);


            startActivity(ıntent);


     */






    }
}