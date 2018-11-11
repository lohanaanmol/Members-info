package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button.setEnabled(false);

    }

    public void button2Click(View v){
        Intent intent = new Intent(MainActivity.this, Khadija.class);
        startActivity(intent);
    }

}
