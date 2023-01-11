package com.example.pgra2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText nameText;
    private String name;
    private Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.mName);
        Button = findViewById(R.id.button);

    Button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                sendData(Button);
        }
    });
    }
    public void sendData(View view){
        name = nameText.getText().toString().trim();
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(MainActivity2.NAME,name);
        startActivity(i);
    }


}