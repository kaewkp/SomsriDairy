package com.example.kaew_pc.somsridiary.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.icu.util.Calendar;
import android.util.Log;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DBHelper extends SQLiteOpenHelper {
    private static final String TAG = "DBHelper";
    private static final String DBName = "Database.db";

    private SQLiteDatabase db;
    private Context context;


    public DBHelper(Context context) {
        super(context, DBName, null, 1);
        this.context = context;
        this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Table Note_data
        String CREATE_Note_data_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(5) PRIMARY KEY , %s TEXT, %s TEXT, %s TEXT, %s VARCHAR(3))",
                Note_data.TABLE,
                Note_data.Column.Note_id,
                Note_data.Column.Note_title,
                Note_data.Column.Note_desc,
                Note_data.Column.Note_date,
                Note_data.Column.Noti_id);

        Log.i(TAG, CREATE_Note_data_TABLE);

        //Table Payments_data
        String CREATE_Payments_data_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(5) PRIMARY KEY , %s TEXT, %s DECIMAL, %s TEXT, %s TEXT," +
                        " %s VARCHAR(3), %s VARCHAR(3), %s VARCHAR(3))",
                Payments_data.TABLE,
                Payments_data.Column.Payments_id,
                Payments_data.Column.Payments_title,
                Payments_data.Column.Payments_price,
                Payments_data.Column.Payments_endDate,
                Payments_data.Column.Payments_date,
                Payments_data.Column.Noti_id,
                Payments_data.Column.PayType_id,
                Payments_data.Column.PayStatus_id);

        Log.i(TAG, CREATE_Payments_data_TABLE);

        // Table Payments_type
        String CREATE_Payments_type_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(3) PRIMARY KEY , %s VARCHAR(30))",
                Payments_type.TABLE,
                Payments_type.Column.PayType_id,
                Payments_type.Column.PayType_name);

        Log.i(TAG, CREATE_Payments_type_TABLE);

        // Table Payments_status
        String CREATE_Payments_status_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(3) PRIMARY KEY , %s VARCHAR(8))",
                Payments_status.TABLE,
                Payments_status.Column.PayStatus_id,
                Payments_status.Column.PayStatus_name);

        Log.i(TAG, CREATE_Payments_status_TABLE);

        //Table Calendar_data
        String CREATE_Calendar_data_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(5) PRIMARY KEY , %s TEXT, %s TEXT, %s TEXT, %s VARCHAR(3), %s VARCHAR(3))",
                Calendar_data.TABLE,
                Calendar_data.Column.Calendar_id,
                Calendar_data.Column.Calendar_title,
                Calendar_data.Column.Calendar_desc,
                Calendar_data.Column.Calendar_time,
                Calendar_data.Column.Noti_id,
                Calendar_data.Column.CalendarType_id);

        Log.i(TAG, CREATE_Calendar_data_TABLE);

        // Table Calendar_type
        String CREATE_Calendar_type_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(3) PRIMARY KEY , %s VARCHAR(30))",
                Calendar_type.TABLE,
                Calendar_type.Column.CalendarType_id,
                Calendar_type.Column.CalendarType_name);

        Log.i(TAG, CREATE_Calendar_type_TABLE);

        // Table Notification_type
        String CREATE_Notification_type_TABLE = String.format("CREATE TABLE %s " +
                        "(%s VARCHAR(3) PRIMARY KEY , %s VARCHAR(30))",
                Notification_type.TABLE,
                Notification_type.Column.Noti_id,
                Notification_type.Column.Noti_name);

        Log.i(TAG, CREATE_Notification_type_TABLE);

        db.execSQL(CREATE_Note_data_TABLE);
        db.execSQL(CREATE_Payments_data_TABLE);
        db.execSQL(CREATE_Payments_type_TABLE);
        db.execSQL(CREATE_Payments_status_TABLE);
        db.execSQL(CREATE_Calendar_data_TABLE);
        db.execSQL(CREATE_Calendar_type_TABLE);
        db.execSQL(CREATE_Notification_type_TABLE);

        insertPaymentType(db,"P01", "ชำระแล้ว" );
        insertPaymentType(db,"P02", "ค้างชำระ" );
        insertNoteData(db);
        insertNotiType(db);


    }

    private void insertPaymentType(SQLiteDatabase payment, String id, String name) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(Payments_type.Column.PayType_id, id);
        initialValues.put(Payments_type.Column.PayType_name, name);
        Log.d("Insert Payment Type", id + " : " + name);

        payment.insert(Payments_type.TABLE, null, initialValues);
    }

    private void insertNoteData(SQLiteDatabase note) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(Note_data.Column.Note_id, "N01");
        initialValues.put(Note_data.Column.Note_title, "สอบFinal13พ.ค.60");
        initialValues.put(Note_data.Column.Note_desc, "ถูกผิด เขียน เติมคำ");
        initialValues.put(Note_data.Column.Note_date, "10/02/2017");
        initialValues.put(Note_data.Column.Noti_id, "1");
        initialValues.put(Note_data.Column.Note_id, "์N02");
        initialValues.put(Note_data.Column.Note_title, "ค่าเทอม");
        initialValues.put(Note_data.Column.Note_desc, "19000");
        initialValues.put(Note_data.Column.Note_date, "15/03/2017");
        initialValues.put(Note_data.Column.Noti_id, "1");
        Log.d("Insert Note Data", "N01 : สอบSW Design Midterm : 27/03/60 : 22/03/60 : 25/03/60");
        Log.d("Insert Note Dsta", "2 : ค้างชำระ");

        note.insert(Note_data.TABLE, null, initialValues);
    }

    private void insertNotiType(SQLiteDatabase noti) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(Notification_type.Column.Noti_id, "01");
        initialValues.put(Notification_type.Column.Noti_name, "");

        initialValues.put(Notification_type.Column.Noti_id, "02");
        initialValues.put(Notification_type.Column.Noti_name, "");

        Log.d("Insert Noti Type", "01 : ");
        Log.d("Insert Noti Type", "02 : ");

        noti.insert(Notification_type.TABLE, null, initialValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //Table Note_data
        String DROP_Note_data_TABLE = "DROP TABLE IF EXISTS " + Note_data.TABLE;

        db.execSQL(DROP_Note_data_TABLE);

        //Table Payments_data
        String DROP_Payments_data_TABLE = "DROP TABLE IF EXISTS " + Payments_data.TABLE;

        db.execSQL(DROP_Payments_data_TABLE);

        //Table Payments_type
        String DROP_Payments_type_TABLE = "DROP TABLE IF EXISTS " + Payments_type.TABLE;

        db.execSQL(DROP_Payments_type_TABLE);

        //Table Payments_status
        String DROP_Payments_status_TABLE = "DROP TABLE IF EXISTS " + Payments_status.TABLE;

        db.execSQL(DROP_Payments_status_TABLE);

        //Table Calendar_data
        String DROP_Calendar_data_TABLE = "DROP TABLE IF EXISTS " + Calendar_data.TABLE;

        db.execSQL(DROP_Calendar_data_TABLE);

        //Table Calendar_type
        String DROP_Calendar_type_TABLE = "DROP TABLE IF EXISTS " + Calendar_type.TABLE;

        db.execSQL(DROP_Calendar_type_TABLE);

        //Table Notification_type
        String DROP_Notification_type_TABLE = "DROP TABLE IF EXISTS " + Notification_type.TABLE;

        db.execSQL(DROP_Notification_type_TABLE);


        Log.i(TAG, "Upgrade Database from " + oldVersion + " to " + newVersion);

        onCreate(db);

    }

    public List<Map.Entry<String,String>> getPayment(){
        Log.d("Search", "query in payment type");
        List<Map.Entry<String,String>> list = new ArrayList<>();

        db = this.getWritableDatabase();

        Cursor cursor = db.query(Payments_type.TABLE, null, null, null, null, null, null); //(table, column, where, where arg, groupby, having, orderby)
        if(cursor.getCount() < 1){

        }
        if (cursor != null) {
            cursor.moveToFirst();
        }

        while(!cursor.isAfterLast()) {
            list.add(new AbstractMap.SimpleEntry<>(cursor.getString(0), cursor.getString(1)));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public List<Map.Entry<String,String>> getNoteData(){
        Log.d("Search", "query in payment type");
        List<Map.Entry<String,String>> list = new ArrayList<>();

        db = this.getWritableDatabase();

        Cursor cursor = db.query(Note_data.TABLE, null, null, null, null, null, null); //(table, column, where, where arg, groupby, having, orderby)
        if(cursor.getCount() < 1){

        }
        if (cursor != null) {
            cursor.moveToFirst();
        }

        while(!cursor.isAfterLast()) {
            list.add(new AbstractMap.SimpleEntry<>(cursor.getString(0), cursor.getString(1)));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }


//    public Payments_data getNote_data(String Note_id) {
//
//        db = this.getReadableDatabase();
//
//        Cursor cursor = db.query(Payments_data.TABLE,
//                null,
//                Payments_data.Column.Note_id + " = ? ",
//                new String[]{Note_id},
//                null,
//                null,
//                null,
//                null);
//
//        if (cursor != null && cursor.getCount() > 0) {
//            cursor.moveToFirst();
//        }else{
//            return null;
//        }
//    }

}

