package com.example.pgrc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class kannadabooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kannadabooks);

        ArrayList<word>words = new ArrayList<word>();

        words.add(new word("Title: Kannada","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Auther name: XXXXX","Publisher: XXXXX","Price: XXX"));

        wordAdapter wordAdapter = new wordAdapter(this, words);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}