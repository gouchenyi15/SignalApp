package stu.bupt.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeStamp {
    private static Date now;
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
    TimeStamp(){}

    static String getStamp(){
        now = new Date();
        return  (formatter.format(now));
    }

    public static void main(String[] args) {
        System.out.println(getStamp());
    }

    public int hasPassed();//已经过去多长时间
}
