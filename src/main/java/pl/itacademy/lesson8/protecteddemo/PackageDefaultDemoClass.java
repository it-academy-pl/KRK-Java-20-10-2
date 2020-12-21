package pl.itacademy.lesson8.protecteddemo;

public class PackageDefaultDemoClass {
    public void doSomething() {
        DemoClass demo = new DemoClass();

        demo.packageDefaultInt =1;
        demo.protectedInt = 1;
        demo.publicInt = 1;
        //demo.privateInt = 1;

        //demo.privateMethod();
        demo.packageDefaultMethod();
        demo.protectedMethod();
        demo.publicMethod();
    }
}
