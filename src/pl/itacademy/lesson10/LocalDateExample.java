package pl.itacademy.lesson10;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate anotherDay = LocalDate.of(2020, 1, 1);
        System.out.println(anotherDay);
    }
}
