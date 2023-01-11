package com.example.pgra4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    private ToggleButton ToggleButton1,ToggleButton2;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton1 = (ToggleButton)findViewById(R.id.TBtn1);
        ToggleButton2 = (ToggleButton)findViewById(R.id.TBtn2);
        Submit = (Button) findViewById(R.id.State);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToogleButton1:").append(ToggleButton1.getText());
                result.append(" ToggleButton2:").append(ToggleButton2.getText());
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}