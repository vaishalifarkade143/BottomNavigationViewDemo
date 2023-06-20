package com.example.bottomnavigationviewdemo.demoone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.bottomnavigationviewdemo.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityOne extends AppCompatActivity {

    BottomNavigationView bottomview_one;
    FrameLayout framelayout_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        framelayout_one = (FrameLayout) findViewById(R.id.framelayout_one);
        bottomview_one = (BottomNavigationView) findViewById(R.id.bottomview_one);

        //by default home screenopen
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_one,new Home()).commit();

        bottomview_one.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                //if we are doing work related menu

                    int item_id = item.getItemId();

                    if (item_id == R.id.home)
                    {
                        item.setChecked(true);//by default color change nhi hua to
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_one,new Home()).commit();
                        return true;
                    } else if (item_id == R.id.myprofile)
                    {
                        item.setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_one,new MyProfile()).commit();
                        return true;
                    } else if (item_id == R.id.message)
                    {
                        item.setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_one,new Messge()).commit();
                        return true;
                    }
                    else if (item_id == R.id.setting)
                    {
                        item.setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_one,new Setting()).commit();
                        return true;
                    }
                return false;

            }
        });
    }
}