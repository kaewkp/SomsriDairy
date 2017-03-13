package com.example.kaew_pc.somsridiary;


/**
 * Created by KAEW-PC on 06-Feb-17.
 */

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.provider.MediaStore;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

//import static com.example.kaew_pc.somsridiary.NewNote.BrowsePictureActivity.SELECT_PICTURE;
import static com.example.kaew_pc.somsridiary.R.styleable.View;

/**
 * Created by KAEW-PC on 06-Feb-17.
 */

public class NewNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newnote);
        ActionBar action = getSupportActionBar();
        action.setDisplayHomeAsUpEnabled(true);
        action.setHomeButtonEnabled(true);

    }
}

