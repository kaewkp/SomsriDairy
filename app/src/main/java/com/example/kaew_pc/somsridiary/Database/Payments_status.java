package com.example.kaew_pc.somsridiary.Database;

/**
 * Created by KAEW-PC on 19-Feb-17.
 */

import android.widget.ListView;
import android.widget.TextView;
import com.example.kaew_pc.somsridiary.R;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Payments_status {

    public static final String DATABASE_NAME = "Payments_status.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE = "Payments_status";

    public class Column{
        public static final String PayStatus_id = "PayStatus_id";
        public static final String PayStatus_name = "PayStatus_name";

    }

    private String PayStatus_id ;
    private String PayStatus_name;


    //Default Constructor
    public Payments_status() {

    }

    //Constructor
    public Payments_status(String PayStatus_id, String PayStatus_name){
        this.PayStatus_id = PayStatus_id;
        this.PayStatus_name = PayStatus_name;

    }//Getter, Setter

    public String getPayStatus_id(){
        return PayStatus_id;
    }

    public String getPayStatus_name(){
        return PayStatus_name;
    }

}