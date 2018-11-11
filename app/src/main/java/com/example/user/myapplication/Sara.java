package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sara extends AppCompatActivity {

    TextView textView13;
    TextView textView14;
    TextView textView15;
    TextView textView16;
    Button button7;
    Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sara);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

    }

    public void button7Click(View v){
        Intent intent = new Intent(Sara.this, Shanza.class);
        startActivity(intent);
    }

    public void button8Click(View v){
        Intent intent = new Intent(Sara.this, Awais.class);
        startActivity(intent);
    }
}
