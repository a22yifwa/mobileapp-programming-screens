package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView=findViewById(R.id.name);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name= extras.getString("name");
            textView.setText(name);
        }
    }
}