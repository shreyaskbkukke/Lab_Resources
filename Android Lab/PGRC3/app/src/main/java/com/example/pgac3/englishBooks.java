package com.example.pgac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class englishBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_books);

        //Create an word list using array
        ArrayList<word> words = new ArrayList<word>();

        //Just a examples for list items
        words.add(new word("Title: English","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
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
        WordAdapter wrdAdopter1 = new WordAdapter(this, words);

        //Set a ListView to list.xml
        ListView listView = findViewById(R.id.englishBooks_list);

        //set array adopter into ListView
        ListView.setAdopter(wrdAdopter1);
    }
}