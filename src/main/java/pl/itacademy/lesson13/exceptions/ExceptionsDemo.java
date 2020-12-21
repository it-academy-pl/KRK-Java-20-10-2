package pl.itacademy.lesson13.exceptions;

import java.util.concurrent.ThreadLocalRandom;

public class ExceptionsDemo {
    public static void main(String[] args) throws NullObjectException {
        try {
            riskyMethod();
            System.out.println("Risky method been executed successfully");
        } catch (RuntimeException e) {
            System.out.println("Risky method been fallen down with exception!");
        } finally {
            System.out.println("Finally section been executed ALWAYS!");
        }

        try {
            System.out.println(sizeOf("Java"));
            System.out.println(sizeOf(""));
            System.out.println(sizeOf("SuperHero"));
        } catch (EmptyStringException e) {
            System.out.println("Empty string been passed to sizeOf method!");
        }


        printObject(new Object());
        printObject(null);

        int[] ints = new int[2];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
    }

    private static void printObject(Object o) throws NullObjectException {
        if(o == null) {
            throw new NullObjectException();
        }
        System.out.println(o.toString());
    }

    private static int sizeOf(String text) {
        if(text.length() == 0) {
            throw new EmptyStringException();
        }
        return text.length();
    }

    private static void riskyMethod() {
        int i = ThreadLocalRandom.current().nextInt(10);
        if(i > 5) {
            throw new RuntimeException();
        }
    }
}
