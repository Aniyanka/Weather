package com.nicolasnelson.falempin.weather;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ChangeUnits extends AppCompatActivity {

    private TextView temperature;
    private TextView tempC;
    private Button backButton;
    private Button uselessButton;
    private TextView tempF;
    NotificationManager manager;
    Notification myNotif;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.units);

        temperature = (TextView) findViewById(R.id.temperature);
        tempC = (TextView) findViewById(R.id.tempC);
        backButton = (Button) findViewById(R.id.backButton);
        tempF = (TextView) findViewById(R.id.tempF);
        uselessButton = (Button) findViewById(R.id.noUse);

        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        uselessButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View uselessButton) {
                Intent goUseless = new Intent(ChangeUnits.this, UselessPage.class);
                startActivity(goUseless);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {

                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(View backButton) {
                        Intent unityChange = new Intent(ChangeUnits.this, MainActivity.class);
                        startActivity(unityChange);
                Intent intent = new Intent("com.rj.notitfications.SECACTIVITY");
                PendingIntent pendingIntent = PendingIntent.getActivity(ChangeUnits.this, 1, intent, 0);

                Notification.Builder builder = new Notification.Builder(ChangeUnits.this);

                builder.setAutoCancel(false);
                builder.setTicker("I'm the doctor");
                builder.setContentTitle("Hello Sweety");
                builder.setContentText("Spoilers! ;) ");
                builder.setSmallIcon(R.drawable.licorne);
                builder.setContentIntent(pendingIntent);
                builder.setOngoing(true);
                builder.setNumber(100);
                builder.build();

                myNotif = builder.getNotification();
                manager.notify(11, myNotif);
                myNotif.vibrate = new long[] {0,200,100,200,100,200};

            }
        });
    }




}