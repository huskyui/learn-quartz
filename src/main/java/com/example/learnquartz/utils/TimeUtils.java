package com.example.learnquartz.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huskyui
 */
public class TimeUtils {
    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getTimeStr(Date date){
        return dateFormat.format(date);
    }
}
