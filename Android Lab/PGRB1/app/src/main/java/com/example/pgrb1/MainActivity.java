package com.example.pgrb1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.app.DatePickerDialog;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public EditText userID, pass, address, ages;
    public RadioGroup genderGroup;
    public TextView date,result;
    public Button selectDate;
    int dayOfMonth, month, year;
    Calendar calendar;
    public DatePickerDialog datePickerDialog;
    public Spinner states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        userID = findViewById(R.id.userID);

        pass = findViewById(R.id.password);

        address = findViewById(R.id.address);

        genderGroup = findViewById(R.id.genderGroup);

        ages = findViewById(R.id.age);

        states = findViewById(R.id.state);

        List<String> list = new ArrayList<String>();
        list.add("Kerala");
        list.add("Tamilnadu");
        list.add("Uttarapradesh");
        list.add("Karnataka");
        list.add("Jammu Kashmeer");
        list.add("Goa");

        selectDate = findViewById(R.id.btnDate);
        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker, int year, int month, int day) {
                        date.setText(day + "/" + (month + 1) + "/" + year);
                    }
                }, year, month, dayOfMonth);
                datePickerDialog.show();
            }
        });
        date = findViewById(R.id.tvSelectedDate);
                });
        }
    }
}