package lesson3;

public class CheckingConditionsExample {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Application ran without arguments!");
        }

        if (args.length == 1) {
            System.out.println("The argument was: " + args[0]);
        }

        // {one, two, three}
        //   0    1     2
        // length = 3
        // [2] = three, [1] = two, [0] = one

        String text = "Beautiful!";
        if (text.length() > 10) {
            System.out.println("We got a long sentence!");
            System.out.println("We got a long sentence!");
        } else {
            System.out.println("The sentence was pretty short :)");
            System.out.println("The sentence was pretty short :)");
        }
    }
}
