package com.example.prasanth.notificationexample;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    Button button;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.edit1);
        editText2=findViewById(R.id.edit2);
        editText3=findViewById(R.id.edit3);
        editText4=findViewById(R.id.edit4);
        button=findViewById(R.id.but1);
        sharedPreferences=getSharedPreferences("hello",MODE_PRIVATE);
        ed=sharedPreferences.edit();
    }

    public void notif(View view) {

        // 1. create a Intent
        // 2. create a PendingIntent
        // 3. design Notification
        // 4. initilaze NotifivstionManager


        Intent intent = new Intent(MainActivity.this,NotificationExample.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,0,intent,0);

        Notification notification = new Notification.Builder(MainActivity.this).setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle("Notification to be received")
                .setContentIntent(pendingIntent)
                .setContentText("message from Email")
                .build();

        NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(0,notification);

        String a=editText1.getText().toString();
        String b=editText2.getText().toString();
        String c=editText3.getText().toString();
        String d=editText4.getText().toString();
        ed.putString("hell",a);
        ed.putString("hel",b);
        ed.putString("he",c);
        ed.putString("h",d);
        ed.commit();

        Toast.makeText(this, "Saved!!", Toast.LENGTH_SHORT).show();

        }
}
