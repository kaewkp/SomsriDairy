package com.example.kaew_pc.somsridiary;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by KAEW-PC on 07-Feb-17.
 */
public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getActionBar().hide();

//        ActionBar action = getSupportActionBar();
//        action.setTitle("Somsri Diary");
    }

}
