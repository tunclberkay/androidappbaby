package com.example.dralpclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DecimalFormat;
import java.util.Locale;

public class kilohesaplama extends AppCompatActivity {

    TextView mcurrentage,mcurrentweight;
    ImageView mincrementage,mincrementweight,mdecrementweight,mdecremantage;

    RelativeLayout mmale,mfemale;
    double intweight=1.0;
    int intage=0;
    String weight2="0";
    String age2="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilohesaplama);

        mcurrentage=findViewById(R.id.calculatebmi);
        mcurrentage=findViewById(R.id.currentage);
        mcurrentweight=findViewById(R.id.currentweight);
        mincrementage=findViewById(R.id.incrementage);
        mdecremantage=findViewById(R.id.decrementage);
        mincrementweight=findViewById(R.id.incrementweight);
        mdecrementweight=findViewById(R.id.decrementweight);



        mmale=findViewById(R.id.male);
        mfemale=findViewById(R.id.female);


        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                intweight=intweight+0.10;
                DecimalFormat df = new DecimalFormat("#.##");
                String weight2 = df.format(intweight);
                //weight2=String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                intweight=intweight-0.10;
                DecimalFormat df = new DecimalFormat("#.##");
                String weight2 = df.format(intweight);
                //weight2=String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intage=intage+1;
                age2=String.valueOf(intage);
                mcurrentage.setText(age2);

                if(intage==13){
                    intage=intage-1;
                    age2=String.valueOf(intage);
                    mcurrentage.setText(age2);
                }


            }

        });
        mdecremantage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intage=intage-1;
                age2=String.valueOf(intage);
                mcurrentage.setText(age2);

                if(intage==-1){
                    intage=intage+1;
                    age2=String.valueOf(intage);
                    mcurrentage.setText(age2);

                }


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
                                ,SplashActivity.class));
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

        boolean a1,a2,a3,a4,a5,a6,a7,a8,b1,b2,b3,b4,b5,b6,b7,b8,c1,c2,c3,c4,c5,c6,c7,c8,d1,d2,d3,d4,d5,d6,d7,d8,e1,e2,e3,e4,e5,e6,e7,e8,f1,f2,f3,f4,f5,f6,f7,f8;
        boolean g1,g2,g3,g4,g5,g6,g7,g8;
        boolean h1,h2,h3,h4,h5,h6,h7,h8;
        boolean k1,k2,k3,k4,k5,k6,k7,k8;
        boolean l1,l2,l3,l4,l5,l6,l7,l8;
        boolean m1,m2,m3,m4,m5,m6,m7,m8;
        boolean n1,n2,n3,n4,n5,n6,n7,n8;

        boolean age1,age2,age3,age4,age5,age6,age7,age8,age9,age10,age11,age12;

        double boy= Double.parseDouble(weight2);


        /* ay1 */

        a1 =(boy<3.1);
        a2 = (boy<3.4 && boy>=3.1);
        a3 = (boy<3.8 && boy >=3.4);
        a4 = (boy<4.2 && boy >=3.8);
        a5 = (boy<4.5 && boy >=4.2);
        a6 = (boy<4.9 && boy >=4.5);
        a7 = (boy<5.2 && boy >=4.9);
        a8 =(boy>5.2);

        /* ay2 */

        b1 =(boy<3.8);
        b2 = (boy<4.2 && boy>=3.8);
        b3 = (boy<4.6 && boy >=4.2);
        b4 = (boy<5.1 && boy >=4.6);
        b5 = (boy<5.6 && boy >=5.1);
        b6 = (boy<6.0 && boy >=5.6);
        b7 = (boy<6.3 && boy >=6.0);
        b8 =(boy>6.3);

        /* ay3 */

        c1 =(boy<4.4);
        c2 = (boy<4.9 && boy>=4.4);
        c3 = (boy<5.3 && boy >=4.9);
        c4 = (boy<5.8 && boy >=5.3);
        c5 = (boy<6.3 && boy >=5.8);
        c6 = (boy<6.7 && boy >=6.3);
        c7 = (boy<7.2 && boy >=6.7);
        c8 =(boy>7.2);

        /* ay4 */

        d1 =(boy<5.0);
        d2 = (boy<5.5 && boy>=5.0);
        d3 = (boy<5.9 && boy >=5.5);
        d4 = (boy<6.4 && boy >=5.9);
        d5 = (boy<7.0 && boy >=6.4);
        d6 = (boy<7.6 && boy >=7.0);
        d7 = (boy<8.1 && boy >=7.6);
        d8 =(boy>8.1);

        /* ay5 */

        e1 =(boy<5.5);
        e2 = (boy<6.0 && boy>=5.5);
        e3 = (boy<6.5 && boy >=6.0);
        e4 = (boy<7.0 && boy >=6.5);
        e5 = (boy<7.6 && boy >=7.0);
        e6 = (boy<8.2 && boy >=7.6);
        e7 = (boy<8.8 && boy >=8.2);
        e8 =(boy>8.8);

        /* ay6 */

        f1 =(boy<5.9);
        f2 = (boy<6.3 && boy>=5.9);
        f3 = (boy<6.8 && boy >=6.3);
        f4 = (boy<7.4 && boy >=6.8);
        f5 = (boy<8.0 && boy >=7.4);
        f6 = (boy<8.6 && boy >=8.0);
        f7 = (boy<9.3 && boy >=8.6);
        f8 =(boy>9.3);

        /* ay7 */

        g1 =(boy<6.3);
        g2 = (boy<6.8 && boy>=6.3);
        g3 = (boy<7.3 && boy >=6.8);
        g4 = (boy<7.9 && boy >=7.3);
        g5 = (boy<8.6 && boy >=7.9);
        g6 = (boy<9.2 && boy >=8.6);
        g7 = (boy<9.9 && boy >=9.2);
        g8 =(boy>9.9);

        /* ay8 */

        h1 =(boy<6.6);
        h2 = (boy<7.1 && boy>=6.6);
        h3 = (boy<7.6 && boy >=7.1);
        h4 = (boy<8.3 && boy >=7.6);
        h5 = (boy<9.0 && boy >=8.3);
        h6 = (boy<9.1 && boy >=9.0);
        h7 = (boy<10.4 && boy >=9.1);
        h8 =(boy>10.4);

        /* ay9 */

        k1 =(boy<6.8);
        k2 = (boy<7.3 && boy>=6.8);
        k3 = (boy<7.8 && boy >=7.3);
        k4 = (boy<8.5 && boy >=7.8);
        k5 = (boy<9.2 && boy >=8.5);
        k6 = (boy<10.0 && boy >=9.2);
        k7 = (boy<10.8 && boy >=10.0);
        k8 =(boy>10.8);

        /* ay10 */

        l1 =(boy<7.0);
        l2 = (boy<7.6 && boy>=7.0);
        l3 = (boy<8.2 && boy >=7.6);
        l4 = (boy<8.9 && boy >=8.2);
        l5 = (boy<9.7 && boy >=8.9);
        l6 = (boy<10.4 && boy >=9.7);
        l7 = (boy<11.2 && boy >=10.4);
        l8 =(boy>11.2);

        /* ay11 */

        m1 =(boy<7.3);
        m2 = (boy<7.9 && boy>=7.3);
        m3 = (boy<8.5 && boy >=7.9);
        m4 = (boy<9.2 && boy >=8.5);
        m5 = (boy<10.0 && boy >=9.2);
        m6 = (boy<10.7 && boy >=10.0);
        m7 = (boy<11.6 && boy >=10.7);
        m8 =(boy>11.6);

        /* ay12 */

        n1 =(boy<7.5);
        n2 = (boy<8.0 && boy>=7.5);
        n3 = (boy<8.6 && boy >=8.0);
        n4 = (boy<9.3 && boy >=8.6);
        n5 = (boy<10.2 && boy >=9.3);
        n6 = (boy<11.0 && boy >=10.2);
        n7 = (boy<11.8 && boy >=11.0);
        n8 =(boy>11.8);


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




        if(intweight==1.0 || intweight <1.0)
        {
            Toast.makeText(getApplicationContext(),"Kilosunu Giriniz",Toast.LENGTH_SHORT).show();
        }
        else if(intage==0 )
        {
            Toast.makeText(getApplicationContext(),"Kaç aylık olduğunu giriniz",Toast.LENGTH_SHORT).show();
        }
        else if(intage<0  || intage>12)
        {
            Toast.makeText(getApplicationContext(),"Lütfen ay değerini 0-12 aralığında Seçiniz",Toast.LENGTH_SHORT).show();
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

                Intent intent = new Intent(getApplicationContext(), kiloboy7.class);
                startActivity(intent);

            }
            else if (k8){

                Intent intent = new Intent(getApplicationContext(), kiloboy8.class);
                startActivity(intent);

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



