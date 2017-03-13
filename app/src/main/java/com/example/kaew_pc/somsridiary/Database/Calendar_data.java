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

    public class Calendar_data {

        public static final String DATABASE_NAME = "Calendar_data.db";
        public static final int DATABASE_VERSION = 1;
        public static final String TABLE = "Calendar_data";

        public class Column{
            public static final String Calendar_id = "Calendar_id";
            public static final String Calendar_title = "Calendar_title";
            public static final String Calendar_desc = "Calendar_desc";
            public static final String Calendar_time = "Calendar_time";
            public static final String Noti_id = "Noti_id";
            public static final String CalendarType_id = "CalendarType_id";
        }

        private String Calendar_id ;
        private String Calendar_title;
        private String Calendar_desc;
        private String Calendar_time;
        private String Noti_id;
        private int CalendarType_id;

        //Default Constructor
        public Calendar_data() {

        }

        //Constructor
        public Calendar_data(String Calendar_id, String Calendar_title, String Calendar_desc, String Calendar_time, String Noti_id, int CalendarType_id){
            this.Calendar_id = Calendar_id;
            this.Calendar_title = Calendar_title;
            this.Calendar_desc = Calendar_desc;
            this.Calendar_time = Calendar_time;
            this.Noti_id = Noti_id;
            this.CalendarType_id = CalendarType_id;
        }//Getter, Setter

        public String getCalendar_id(){
            return Calendar_id;
        }

        public String getCalendar_title(){
            return Calendar_title;
        }

        public String getCalendar_desc(){
            return Calendar_desc;
        }

        //    private ListView date;
        public String getCalendar_time(){

//        date = (ListView) findViewById(R.id.listView);
//
//        java.util.Date time = Calendar.getInstance().getTime();
//
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        String formattedDate = df.format(time);
//
//        android.util.Log.i("Time Class ", " Time value in milliseconds "+time.getYear());
//        date.setText(formattedDate);

            return Calendar_time;
        }

        public String getNoti_id(){
            return Noti_id;
        }

        public int getCalendarType_id(){
            return CalendarType_id;
        }
    }

