package pl.itacademy.lesson8.protecteddemo;

public class DemoClass {
    private int privateInt;
    int packageDefaultInt;
    protected int protectedInt;
    public int publicInt;

    private void privateMethod() {
        privateInt = 0;
        packageDefaultInt = 1;
    }

    void packageDefaultMethod() {
        privateInt = 0;
        packageDefaultInt = 1;
    }

    protected void protectedMethod() {
        privateInt = 0;
        packageDefaultInt = 1;
    }

    public void publicMethod() {
        privateInt = 0;
        packageDefaultInt = 1;
    }
}
