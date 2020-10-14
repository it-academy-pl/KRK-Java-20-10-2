package lesson4;

import java.util.Scanner;

public class TernaryIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String value = number % 2 == 0 ? "even" : "odd";
        System.out.println("You provided " + value + " number");

        if (number % 2 == 0) {
            System.out.println("You provided even number");
        } else {
            System.out.println("You provided odd number");
        }

    }
}
