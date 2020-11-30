package pl.itacademy.lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesBeforeJava8 {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        System.out.println(now);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.set(2021, Calendar.JANUARY, 1);
        now = calendar.getTime();
        System.out.println(now);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format(now);
        System.out.println(dateString);

        Date date = format.parse("2019-12-31 23:59:59");
        System.out.println(date);

        System.out.println(date.getTime()); // <- a Unix Time: amount of MS gone after 1st of Jan 1970 00:00
        date.setTime(1577873199000L);
        System.out.println(date);

    }
}
