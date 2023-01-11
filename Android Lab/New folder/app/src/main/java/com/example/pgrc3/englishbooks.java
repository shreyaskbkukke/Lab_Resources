package com.example.pgrc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class englishbooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishbooks);

        ArrayList<word>words = new ArrayList<word>();

        words.add(new word("Title: English","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));

        wordAdapter wrdAdopter = new wordAdapter(this, words);

        ListView listView = findViewById(R.id.english_books);
        listView.setAdapter(wrdAdopter);
    }
}