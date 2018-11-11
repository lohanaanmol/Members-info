package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Khadija extends AppCompatActivity {

    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadija);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
    }


    public void button3Click(View v){
        Intent intent = new Intent(Khadija.this, MainActivity.class);
        startActivity(intent);
    }
    public void button4Click(View v){
        Intent intent = new Intent(Khadija.this, Shanza.class);
        startActivity(intent);
    }
    }

