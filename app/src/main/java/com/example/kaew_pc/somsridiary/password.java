package com.example.kaew_pc.somsridiary;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by KAEW-PC on 07-Feb-17.
 */
public class password extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        ActionBar action = getSupportActionBar();

        action.setTitle("Somsri Diary");



    }


}
