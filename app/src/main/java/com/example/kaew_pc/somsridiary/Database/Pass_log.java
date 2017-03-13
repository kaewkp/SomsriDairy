package com.example.kaew_pc.somsridiary.Database;

/**
 * Created by KAEW-PC on 21-Feb-17.
 */

import android.widget.ListView;
import android.widget.TextView;
import com.example.kaew_pc.somsridiary.R;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class Pass_log {

    public static final String DATABASE_NAME = "Pass_log.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE = "Pass_log";

    public class Column{
        public static final String Pass_id = "Pass_id";
        public static final String Pass_password = "Pass_password";
        public static final String Pass_email = "Pass_email";

    }

    private int Pass_id ;
    private int Pass_password;
    private String Pass_email;

    //Default Constructor
    public Pass_log() {

    }

    //Constructor
    public Pass_log(int Pass_id, int Pass_password, String Pass_email){
        this.Pass_id = Pass_id;
        this.Pass_password = Pass_password;
        this.Pass_email = Pass_email;

    }//Getter, Setter

    public int getPass_id(){
        return Pass_id;
    }

    public int getPass_password() {
        return Pass_password;
    }

    public String getPass_email() {
        return Pass_email;
    }

}
