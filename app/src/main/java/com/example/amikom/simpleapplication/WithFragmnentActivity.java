package com.example.amikom.simpleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class WithFragmnentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Fragment");
        setContentView(R.layout.activity_with_fragmnent);
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();


        FirstFragment FirstFragment = new FirstFragment();

        transaction.add(R.id.frame_content, FirstFragment);


        transaction.commit();


    }
}
