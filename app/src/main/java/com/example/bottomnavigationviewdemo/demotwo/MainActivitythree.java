package com.example.bottomnavigationviewdemo.demotwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bottomnavigationviewdemo.R;

public class MainActivitythree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythree);


    }
    public void fabIconClick(View view)
    {
        Toast.makeText(this, "Clicked!!!!", Toast.LENGTH_SHORT).show();
    }
}