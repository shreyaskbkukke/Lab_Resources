package com.example.pgac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class kannadaBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kannada_books);

        //Create an word list using array
        ArrayList<word> words = new ArrayList<word>();

        //Just a examples for list of items
        words.add(new word("Title: Kannada","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));

        //Set a Word into custom array adopter
        wordAdopter wrdAdopter2 = new wordAdopter(this, words);

        //Set a ListView to list.xml
        ListView listView = findViewById(R.id.kannadaBooks_list);

        //set array adopter into ListView
        ListView.setAdopter(wrdAdopter2);
    }
}