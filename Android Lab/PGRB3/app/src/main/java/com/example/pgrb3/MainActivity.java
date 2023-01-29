package com.example.pgrb3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId())
        {
            case R.id.new_menu:
                Toast.makeText(MainActivity.this, "New",Toast.LENGTH_SHORT).show();
                break;
            case R.id.open:
                Toast.makeText(MainActivity.this, "Open",Toast.LENGTH_SHORT).show();
                break;
            case R.id.save:
                Toast.makeText(MainActivity.this, "Save",Toast.LENGTH_SHORT).show();
                break;
            case R.id.saveas:
                Toast.makeText(MainActivity.this, "Save as",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu, menu);
        return true;
    }
}