package pl.itacademy.lesson6;

public class Min {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provided empty arguments!");
            return;
        }

        int min = Integer.parseInt(args[0]);
//        for (int i = 0; i < args.length; i++) {
//            int number = Integer.parseInt(args[i]);
//            if (min > number) {
//                min = number;
//            }
//        }

        for (String arg : args) {
            int number = Integer.parseInt(arg);
            if (min > number) {
                min = number;
            }
        }

        System.out.printf("The minimum number was: %d", min);
    }
}
