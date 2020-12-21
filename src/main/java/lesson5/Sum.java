package lesson5;

public class Sum {
    public static void main(String[] args) {
        for (String arg : args) {
            //check if any arg contains dot .
            //if yes - use double
            //if not - use integer
        }
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}
