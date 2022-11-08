package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class boyhesaplama extends AppCompatActivity {

    SeekBar mseekbarforheight;
    TextView mcurrentheight;
    TextView mcurrentage;
    ImageView mincrementage,mdecremantage;

    int currentprogress;
    int intage=0;
    String mintprogress="0";
    String age2="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyhesaplama);


        mseekbarforheight=findViewById(R.id.seekbarforheight);
        mcurrentheight=findViewById(R.id.currentheight);
        mincrementage=findViewById(R.id.incrementage);
        mdecremantage=findViewById(R.id.decrementage);
        mcurrentage=findViewById(R.id.calculatebmi);
        mcurrentage=findViewById(R.id.currentage);




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


            boolean a1,a2,a3,a4,a5,a6,a7,a8;
            boolean b1,b2,b3,b4,b5,b6,b7,b8;
            boolean c1,c2,c3,c4,c5,c6,c7,c8;
            boolean d1,d2,d3,d4,d5,d6,d7,d8;
            boolean e1,e2,e3,e4,e5,e6,e7,e8;
            boolean f1,f2,f3,f4,f5,f6,f7,f8;
            boolean g1,g2,g3,g4,g5,g6,g7,g8;
            boolean h1,h2,h3,h4,h5,h6,h7,h8;
            boolean k1,k2,k3,k4,k5,k6,k7,k8;
            boolean l1,l2,l3,l4,l5,l6,l7,l8;
            boolean m1,m2,m3,m4,m5,m6,m7,m8;
            boolean n1,n2,n3,n4,n5,n6,n7,n8;

            boolean age1,age2,age3,age4,age5,age6,age7,age8,age9,age10,age11,age12;

            double boy= Double.parseDouble(mintprogress);


            /* ay1 */

            a1 =(boy<49);
            a2 = (boy<50 && boy>=49);
            a3 = (boy<52 && boy >=50);
            a4 = (boy<53 && boy >=52);
            a5 = (boy<55 && boy >=53);
            a6 = (boy<56 && boy >=55);
            a7 = (boy<58 && boy >=56);
            a8 =(boy>58);

            /* ay2 */

            b1 =(boy<52);
            b2 = (boy<54 && boy>=52);
            b3 = (boy<56 && boy >=54);
            b4 = (boy<57 && boy >=56);
            b5 = (boy<58 && boy >=57);
            b6 = (boy<60 && boy >=58);
            b7 = (boy<62 && boy >=60);
            b8 =(boy>62);

            /* ay3 */

            c1 =(boy<55);
            c2 = (boy<57 && boy>=55);
            c3 = (boy<58 && boy >=57);
            c4 = (boy<60 && boy >=58);
            c5 = (boy<62 && boy >=60);
            c6 = (boy<63 && boy >=62);
            c7 = (boy<65 && boy >=63);
            c8 =(boy>65);

            /* ay4 */

            d1 =(boy<58);
            d2 = (boy<60 && boy>=58);
            d3 = (boy<61 && boy >=59);
            d4 = (boy<63 && boy >=61);
            d5 = (boy<64 && boy >=63);
            d6 = (boy<66 && boy >=64);
            d7 = (boy<67 && boy >=66);
            d8 =(boy>67);

            /* ay5 */

            e1 =(boy<60);
            e2 = (boy<61 && boy>=60);
            e3 = (boy<63 && boy >=61);
            e4 = (boy<64 && boy >=63);
            e5 = (boy<66 && boy >=65);
            e6 = (boy<68 && boy >=66);
            e7 = (boy<69 && boy >=68);
            e8 =(boy>69);

            /* ay6 */

            f1 =(boy<62);
            f2 = (boy<63 && boy>=62);
            f3 = (boy<65 && boy >=63);
            f4 = (boy<66 && boy >=65);
            f5 = (boy<68 && boy >=66);
            f6 = (boy<70 && boy >=68);
            f7 = (boy<71 && boy >=70);
            f8 =(boy>71);

            /* ay7 */

            g1 =(boy<63);
            g2 = (boy<65 && boy>=63);
            g3 = (boy<66 && boy >=65);
            g4 = (boy<68 && boy >=66);
            g5 = (boy<70 && boy >=68);
            g6 = (boy<72 && boy >=70);
            g7 = (boy<73 && boy >=72);
            g8 =(boy>73);

            /* ay8 */

            h1 =(boy<65);
            h2 = (boy<66 && boy>=65);
            h3 = (boy<68 && boy >=66);
            h4 = (boy<70 && boy >=68);
            h5 = (boy<72 && boy >=70);
            h6 = (boy<73 && boy >=72);
            h7 = (boy<75 && boy >=73);
            h8 =(boy>75);

            /* ay9 */

            k1 =(boy<66);
            k2 = (boy<68 && boy>=66);
            k3 = (boy<69 && boy >=68);
            k4 = (boy<71 && boy >=69);
            k5 = (boy<73 && boy >=71);
            k6 = (boy<75 && boy >=73);
            k7 = (boy<76 && boy >=75);
            k8 =(boy>76);

            /* ay10 */

            l1 =(boy<67);
            l2 = (boy<69 && boy>=67);
            l3 = (boy<71 && boy >=69);
            l4 = (boy<73 && boy >=71);
            l5 = (boy<75 && boy >=73);
            l6 = (boy<76 && boy >=75);
            l7 = (boy<78 && boy >=76);
            l8 =(boy>78);

            /* ay11 */

            m1 =(boy<69);
            m2 = (boy<70 && boy>=69);
            m3 = (boy<72 && boy >=70);
            m4 = (boy<74 && boy >=73);
            m5 = (boy<76 && boy >=74);
            m6 = (boy<78 && boy >=76);
            m7 = (boy<80 && boy >=78);
            m8 =(boy>80);

            /* ay12 */

            n1 =(boy<70);
            n2 = (boy<71 && boy>=70);
            n3 = (boy<73 && boy >=71);
            n4 = (boy<75 && boy >=73);
            n5 = (boy<77 && boy >=75);
            n6 = (boy<79 && boy >=77);
            n7 = (boy<81 && boy >=79);
            n8 =(boy>81);





            age1=(intage==1);
            age2=(intage==2);
            age3=(intage==3);
            age4=(intage==4);
            age5=(intage==5);
            age6=(intage==6);
            age7=(intage==7);
            age8=(intage==8);
            age9=(intage==9);
            age10=(intage==10);
            age11=(intage==11);
            age12=(intage==12);




            if(mintprogress.equals("0"))
            {
                Toast.makeText(getApplicationContext(),"Boyunu Giriniz",Toast.LENGTH_SHORT).show();
            }
            else if(intage==0 || intage <0)
            {
                Toast.makeText(getApplicationContext(),"Kaç aylık olduğunu giriniz",Toast.LENGTH_SHORT).show();
            }

            else if(age1) {

                if(a1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (a2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (a3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (a4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (a5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (a6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (a7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (a8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age2) {

                if(b1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (b2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (b3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (b4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (b5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (b6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (b7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (b8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age3) {

                if(c1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (c2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (c3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (c4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (c5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (c6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (c7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (c8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age4) {

                if(d1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (d2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (d3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (d4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (d5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (d6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (d7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (d8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age5) {

                if(e1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (e2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (e3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (e4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (e5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (e6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (e7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (e8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age6) {

                if(f1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (f2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (f3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (f4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (f5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (f6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (f7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (f8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age7) {

                if(g1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (g2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (g3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (g4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (g5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (g6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (g7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (g8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age8) {

                if(h1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (h2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (h3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (h4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (h5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (h6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (h7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (h8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age9) {

                if(k1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (k2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (k3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (k4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (k5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (k6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (k7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (k8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age10) {

                if(l1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (l2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (l3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (l4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (l5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (l6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (l7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (l8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age11) {

                if(m1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (m2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (m3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (m4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (m5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (m6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (m7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (m8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }

            else if(age12) {

                if(n1){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy.class);
                    startActivity(ıntent);

                }
                else if (n2){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy2.class);
                    startActivity(ıntent);

                }
                else if (n3){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy3.class);
                    startActivity(ıntent);

                }
                else if (n4){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy4.class);
                    startActivity(ıntent);

                }
                else if (n5){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy5.class);
                    startActivity(ıntent);

                }
                else if (n6){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy6.class);
                    startActivity(ıntent);

                }
                else if (n7){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy7.class);
                    startActivity(ıntent);

                }
                else if (n8){

                    Intent ıntent = new Intent(getApplicationContext(), kiloboy8.class);
                    startActivity(ıntent);

                }

            }





        }
}