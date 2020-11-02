package pl.itacademy.lesson8;

public class StaticBlock {
    private int a;
    private static int b;

    static {
       b = 1;
        System.out.println("StaticBlock class being initialized!");
    }

    public StaticBlock() {
        System.out.println("Constructor steps starts here!");
        a = 1;
        b = 2;
    }

    public void doSomething() {

    }

    public static void staticMethod() {

    }
}
