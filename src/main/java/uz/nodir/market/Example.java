package uz.nodir.market;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        System.out.println(date.getTime());

    }
}
