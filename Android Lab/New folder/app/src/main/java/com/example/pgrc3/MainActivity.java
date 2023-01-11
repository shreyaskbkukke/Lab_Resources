package com.example.pgrc3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView kannadaBooks = findViewById(R.id.kannada_books);
        kannadaBooks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kannadaBookIntent = new Intent(getApplicationContext(),kannadabooks.class);
                startActivity(kannadaBookIntent);
            }
        });
        TextView englishBooks = findViewById(R.id.englishBooks);
        englishBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishBookIntent = new Intent(getApplicationContext(),englishbooks.class);
                startActivity(englishBookIntent);
            }
        });
    }
}