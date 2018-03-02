package com.example.rushikesh.busapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmergencyContacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);
    }
    public void onClickHospital(View view)
    {
        Intent i = new Intent(this, EcHospital.class);
        startActivity(i);
    }
    public void onClickCrane(View view)
    {
        Intent i = new Intent(this, EcCrane.class);
        startActivity(i);
    }
    public void onClickAmbulance(View view)
    {
        Intent i = new Intent(this, EcAmbulance.class);
        startActivity(i);
    }
    public void onClickBloodbank(View view)
    {
        Intent i = new Intent(this, EcBloodbank.class);
        startActivity(i);
    }
}
