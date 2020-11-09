package pl.itacademy.lesson10;

public interface WithWindow {

    //JAVA 7 interface looks like:
    public static final String TEST = "test";

    void openWindow();
    void closeWindow();

    //JAVA 8 additionally can contains:
    default void replaceWindow() {
        System.out.println("Window has been replaced");
    }

    static void doSomething() {

    }

    //JAVA 9 additionally can contains:
    private static void privateStaticMethod() {

    }

    private void privateNonStaticMethod() {

    }
}
