package com.example.pgrc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {
    public wordAdapter(Activity context, ArrayList<word> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check if the existing view is being reused, otherwise inflated the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);

        }
        word Iaa = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(Iaa.getTitle());
        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(Iaa.getAuthor());
        TextView publisher = (TextView) listItemView.findViewById(R.id.publisher);
        publisher.setText(Iaa.getPublisher());
        TextView price = (TextView) listItemView.findViewById(R.id.price);
        price.setText(Iaa.getPrice());
        return listItemView;
    }
}