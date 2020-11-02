package pl.itacademy.lesson8;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println("1 is odd: " + isOdd(1));
        System.out.println("2 is odd: " + isOdd(2));
        System.out.println("3 is odd: " + isOdd(3));
        System.out.println("4 is odd: " + isOdd(4));
    }

    private static boolean isOdd(int number) {
        if (number == 1) {
            return true;
        }
        return !isOdd(number - 1);
    }
}
