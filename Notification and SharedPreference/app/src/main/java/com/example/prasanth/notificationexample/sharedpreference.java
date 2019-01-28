package com.example.prasanth.notificationexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class sharedpreference extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor ed;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_preference);
        textView1=findViewById(R.id.text1);
        textView2=findViewById(R.id.text2);
        textView3=findViewById(R.id.text3);
        textView4=findViewById(R.id.text4);
        sharedPreferences=getSharedPreferences("hello",MODE_PRIVATE);
        ed=sharedPreferences.edit();

        String s1=sharedPreferences.getString("hell","delvalue");
        String s2=sharedPreferences.getString("hel","delvalue");
        String s3=sharedPreferences.getString("he","delvalue");
        String s4=sharedPreferences.getString("h","delvalue");

        textView1.setText(s1);
        textView2.setText(s2);
        textView3.setText(s3);
        textView4.setText(s4);

        }
}
