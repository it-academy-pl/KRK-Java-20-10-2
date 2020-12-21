package lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Number is 1");
                System.out.println("just a line");
                break;
            case 2:
                System.out.println("Number is 2");
                System.out.println("just a line in second block");
                break;
            case 3:
                System.out.println("Number is 3");
                System.out.println("third block");
                break;
            default:
                System.out.println("Number is more than 3");
        }
    }
}
