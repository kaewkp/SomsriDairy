package com.example.kaew_pc.somsridiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;
import java.util.Map;
import android.widget.ListView;
import android.widget.TextView;
import com.example.kaew_pc.somsridiary.Database.DBHelper;



public class MainActivity extends AppCompatActivity{
    private DBHelper db;
    private TextView textView;
    private ListView lv1;
    private List<Map.Entry<String,String>> list;
    private String[] l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listnote);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        ActionBar action = getSupportActionBar();
        action.setTitle("Somsri Diary");

        queryNotedata();
//        queryPayment();
        init();
//        queryNoteData();

    }
    private void queryNotedata() {
        db = new DBHelper(this);
        list = db.getPayment();
        l = new String[list.size()];
        for(int i = 0; i< list.size(); i++){
            l[i] = list.get(i).getValue();
        }

    }

//    private void queryPayment() {
//        list = db.getPayment();
//        l = new String[list.size()];
//        for(int i = 0; i< list.size(); i++){
//            l[i] = list.get(0).getKey();
//        }
//
//    }

//    private void queryNoteData() {
//        List<Map.Entry<String,String>> list = db.getNoteData();
//        lv1.setText(list.get(0).getKey());
//        lv2.setText(list.get(0).getValue());
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    private void init() {
//        this.deleteDatabase("Dictionary"); //delete DB for begin version 1 again
        textView = (TextView) findViewById(R.id.subject);



        MyAdapter adapter = new MyAdapter(MainActivity.this, l);
        lv1 = (ListView) findViewById(R.id.listview);

        lv1.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {

            case R.id.action_add:
                intent = new Intent(getApplicationContext(), ListNote.class);
                startActivity(intent);
                return true;

            case R.id.action_settings:
                intent = new Intent(getApplicationContext(), password.class);
                startActivity(intent);
                return true;


//            case R.id.onAc
//            intent = new Intent();
//            intent.setType("image/*");
//            intent.setAction(Intent.ACTION_GET_CONTENT);//
//            startActivityForResult(Intent.createChooser(intent, "Select Picture"),SELECT_IMAGE);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
