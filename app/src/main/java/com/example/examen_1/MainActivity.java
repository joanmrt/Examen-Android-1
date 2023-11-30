package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentList fragment_list = new FragmentList();
        FragmentList fragment_list_land = new FragmentList();
        FragmentInfo fragment_info = new FragmentInfo();



        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainerViewLand, fragment_list_land).commit();
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainerView, fragment_list).commit();
        }
    }
}