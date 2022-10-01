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

        Button myButton = (Button) findViewById(R.id.button2);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here, we are generating a random number
                Random generator = new Random();
                int number = generator.nextInt(5) + 1;
                // The '5' is the number of activities

                Class activity = null;

                // Here, we are checking to see what the output of the random was
                switch (number) {
                    case 1:
                        // E.g., if the output is 1, the activity we will open is ActivityOne.class
                        activity = ay5asi.class;
                        break;
                    case 2:
                        activity = ay2oyuncak.class;
                        break;
                    case 3:
                        activity = ay8beslenme.class;
                        break;
                    case 4:
                        activity = hakkimda.class;
                        break;
                    default:
                        activity = ay7asi.class;
                        break;
                }
                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);
            }
        });

    }
}
