package lesson4;

import java.util.concurrent.ThreadLocalRandom;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            double a = ThreadLocalRandom.current().nextDouble();
            if (a > 0.5) {
                System.out.println(a);
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
