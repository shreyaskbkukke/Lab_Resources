package com.example.pgra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    public static final String NAME="NAME";
    private TextView nameText;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameText = findViewById(R.id.mName1);

        Intent i=getIntent();
        name = i.getStringExtra(NAME);

        nameText.setText("Hi! \t"+name);
    }
}