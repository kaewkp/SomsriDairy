package com.example.kaew_pc.somsridiary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by KAEW-PC on 04-Mar-17.
 */

public class MyAdapter extends ArrayAdapter<String> {

    private Activity mContext;
    private String[] strName;
    private View row;

    public MyAdapter(Activity mContext, String[] strName) {
        super(mContext,R.layout.listview_notedata,strName);
        this.mContext = mContext;
        this.strName = strName;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = mContext.getLayoutInflater();

        row = mInflater.inflate(R.layout.listview_notedata,null,true);

        TextView textView1 = (TextView)row.findViewById(R.id.textView2);
        textView1.setText(strName[position]);

        return row;
    }
}

