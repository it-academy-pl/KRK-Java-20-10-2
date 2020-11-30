package pl.itacademy.lesson14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.*;


public class DatesAfterJava8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        today = today.plusDays(5);
        System.out.println(today);

        today = today.minus(5, MONTHS);
        System.out.println(today);

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE")));

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.plus(5, HOURS));
        System.out.println(now);

        System.out.println(now.format(DateTimeFormatter.ofPattern("HH=mm")));
        LocalTime parsed = LocalTime.parse("15-34-56", DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(parsed);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        System.out.println(now2.plus(20, SECONDS));
        System.out.println(now2.plus(20, DAYS));
    }
}
