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

public class Notification_type {

    public static final String DATABASE_NAME = "Notification_type.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE = "Notification_type";

    public class Column{
        public static final String Noti_id = "Noti_id";
        public static final String Noti_name = "Noti_name";

    }

    private String Noti_id ;
    private String Noti_name;


    //Default Constructor
    public Notification_type() {

    }

    //Constructor
    public Notification_type(String Noti_id, String Noti_name){
        this.Noti_id = Noti_id;
        this.Noti_name = Noti_name;

    }//Getter, Setter

    public String getNoti_id(){
        return Noti_id;
    }

    public String getNoti_name(){
        return Noti_name;
    }

}
