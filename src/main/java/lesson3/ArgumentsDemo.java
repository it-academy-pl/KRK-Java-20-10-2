package lesson3;

public class ArgumentsDemo {
    public static void main(String[] args) {
        System.out.println("Number of provided arguments is: " + args.length);
        System.out.println("The first argument was: " + args[0]);
        System.out.println("The last argument was: " + args[args.length - 1]);
    }
}
