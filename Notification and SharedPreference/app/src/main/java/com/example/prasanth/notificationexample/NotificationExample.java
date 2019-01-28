package com.example.prasanth.notificationexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NotificationExample extends AppCompatActivity{

    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        button=findViewById(R.id.buttt);

    }

    public void gett(View view) {

        Intent intent=new Intent(NotificationExample.this,javamusic_player.class);
        startActivity(intent);

        }
}
