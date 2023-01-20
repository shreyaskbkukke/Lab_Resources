package com.example.pgrc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText No1;
    private EditText No2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        No1 = findViewById(R.id.Number1);
        No2 = findViewById(R.id.Number2);
        result = findViewById(R.id.RESULT);
    }
    public void sum(View view) {
        int n1 = Integer.parseInt(No1.getText().toString());
        int n2 = Integer.parseInt(No2.getText().toString());
        int sum = n1 + n2;
        result.setText(String.valueOf(sum));
    }
    public void sub(View view) {
        int n1 = Integer.parseInt(No1.getText().toString());
        int n2 = Integer.parseInt(No2.getText().toString());
        int sub = n1 - n2;
        result.setText(String.valueOf(sub));
    }
    public void multi(View view) {
        int n1 = Integer.parseInt(No1.getText().toString());
        int n2 = Integer.parseInt(No2.getText().toString());
        int multi = n1 * n2;
        result.setText(String.valueOf(multi));
    }
    public void div(View view) {
        int n1 = Integer.parseInt(No1.getText().toString());
        int n2 = Integer.parseInt(No2.getText().toString());
        int div = n1 / n2;
        result.setText(String.valueOf(div));
    }
    public void clear(View view) {
        No1.setText(null);
        No2.setText(null);
        result.setText(null);
    }
}