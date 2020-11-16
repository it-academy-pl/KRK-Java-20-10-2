package lesson4;

import java.util.Arrays;

public class ElseIfDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments been provided");
            System.out.println(Arrays.toString(args));
        } else if (args.length < 5) {
            System.out.println("Have been provided less than 5 arguments");
            System.out.println(Arrays.toString(args));
        } else if (args.length < 10) {
            System.out.println("Have been provided less than 10 arguments");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("Have been provided 10 or more arguments");
            System.out.println(Arrays.toString(args));
        }
    }
}
