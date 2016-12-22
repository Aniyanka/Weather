package com.nicolasnelson.falempin.weather;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class UselessPage extends AppCompatActivity {


    private TextView stupid;
    private TextView but;
    private ImageView snape;
    private TextView goback;
    protected void onCreate(Bundle savedInstanceState) {

        stupid = (TextView) findViewById(R.id.idiot);
        but = (TextView) findViewById(R.id.but);
        snape = (ImageView) findViewById(R.id.snape);
        goback = (TextView) findViewById(R.id.textView3);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.useless);

        Toast.makeText(getApplicationContext(),
                "Nice to see you on the useless zone, muggle", Toast.LENGTH_LONG).show();


    }
}
