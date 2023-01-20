package com.example.pgac3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {
    public wordAdopter(Activity context, ArrayList<word> words){
        super(context,0,words);
}
@Override
public View getView(int position, View convertView, ViewGroup parent){
    //Check if the existing view is being reused. otherwise inflate the view
    View listItemView = convertView;
    if(listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list,false)
    }
    word Iaa = getItem(position);
    TextView title = (TextView) listItemView.findViewById(R.id.Title);
    title.setText(Iaa.getTitle());
    TextView author = (TextView) listItemView.findViewById(R.id.Author);
    author.setText(Iaa.getAuthor());
    TextView publisher = (TextView) listItemView.findViewById(R.id.Publisher);
    publisher.setText(Iaa.getpublisher());
    TextView price = (TextView) listItemView.findViewById(R.id.Title);
    price.setText(Iaa.getPrice());
    return listItemView;
}