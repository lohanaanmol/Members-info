package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shanza extends AppCompatActivity {

    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;
    Button button5;
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanza);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        button5 = findViewById(R.id.button);
        button6 = findViewById(R.id.button2);

    }

    public void button5Click(View v){
        Intent intent = new Intent(Shanza.this, Khadija.class);
        startActivity(intent);
    }

    public void button6Click(View v){
        Intent intent = new Intent(Shanza.this, Sara.class);
        startActivity(intent);
    }
}
