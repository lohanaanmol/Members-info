package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Awais extends AppCompatActivity {

    TextView textView17;
    TextView textView18;
    TextView textView19;
    TextView textView20;
    Button button9;
    Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awais);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button10.setEnabled(false);

    }

    public void button9Click(View v){
        Intent intent = new Intent(Awais.this, Sara.class);
        startActivity(intent);
    }
}
