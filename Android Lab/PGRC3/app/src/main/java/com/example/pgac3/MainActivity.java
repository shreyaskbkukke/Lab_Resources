package com.example.pgac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView kannadaBooks = findViewById(R.id.Kannada_Books_btn);
        kannadaBooks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kannadaBookIntent = new Intent(getApplicationContext(), KannadaBooks.class);
                startActivity(kannadaBookIntent);
            }
        });
        TextView englishBooks = findViewById(R.id.English_Books_btn);
        englishBooks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent englishBookIntent = new Intent(getApplicationContext(), englishBooks.class);
                startActivity(englishBookIntent);
            }
        });
    }
}