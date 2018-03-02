package com.example.rushikesh.busapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EcBloodbank extends AppCompatActivity {
    TextView Cl, Cl2;
    Button Cl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_ec_bloodbank );
        Cl = (TextView) findViewById ( R.id.Bb );
        Cl2 = (TextView) findViewById ( R.id.Bb2 );
        Cl3 = (Button) findViewById ( R.id.Bb3);
    }

    public void Bb3(View v) {
        Intent i = new Intent ( Intent.ACTION_DIAL );
        i.setData ( Uri.parse ( "02162226995" ) );
        startActivity ( i );
            }
}
