package pl.itacademy.lesson19;

import java.math.BigDecimal;

public class Util {

    @Deprecated(since = "16.12.2020", forRemoval = true)
    public static double sum(double a, double b) {
        return a + b;
    }

    public static BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
