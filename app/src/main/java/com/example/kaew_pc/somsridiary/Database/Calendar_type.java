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
public class Calendar_type {

    public static final String DATABASE_NAME = "Calendar_type.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE = "Calendar_type";

    public class Column{
        public static final String CalendarType_id = "CalendarType_id";
        public static final String CalendarType_name = "CalendarType_name";

    }

    private String CalendarType_id ;
    private String CalendarType_name;


    //Default Constructor
    public Calendar_type() {

    }

    //Constructor
    public Calendar_type(String CalendarType_id, String CalendarType_name){
        this.CalendarType_id = CalendarType_id;
        this.CalendarType_name = CalendarType_name;

    }//Getter, Setter

    public String getCalendarType_id(){
        return CalendarType_id;
    }

    public String getCalendarType_name(){
        return CalendarType_name;
    }

}