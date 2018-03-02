package com.example.rushikesh.busapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView ss2,ss3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] texts = { "Bus Stand","Rajwada","Pawai Naka","Javle Wadi","Maha Gaon","Azad Nagar","Patarwal","Khed","Koyana Socity","Karandwadi","Laman Wadi","Borkhal","Mhasve","Mangalwar Tale","Shahupuri","Karmaveer","Matale","Patkhal"};
        ss2 =(AutoCompleteTextView) findViewById ( R.id.ss1 );
        ss3 =(AutoCompleteTextView) findViewById ( R.id.auto2);
        ArrayAdapter<String> adapter = new ArrayAdapter <String> ( this,android.R.layout.simple_list_item_1,texts );
        ss2.setAdapter ( adapter );
        ss3.setAdapter ( adapter );

    }
    public void onClickEC(View view)
    {
        Intent i = new Intent(this, EmergencyContacts.class);
        startActivity(i);
    }
    public void Search(View view)
    {
        Intent i = new Intent(this,resultPath.class);
        startActivity(i);
    }
}
