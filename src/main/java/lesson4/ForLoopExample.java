package lesson4;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int counter = 0; counter < 5; counter++) {
            System.out.println("You will be the best java developers!");
        }
        System.out.println("That's the end folks!");

        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

        for (String argument : args) {
            System.out.print(argument + " ");
        }
    }
}
