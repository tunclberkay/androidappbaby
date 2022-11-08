package com.example.dralpclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class beklemede extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beklemede);



    }
    public void foto9(View view){
        Intent ıntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(ıntent);

    }
}