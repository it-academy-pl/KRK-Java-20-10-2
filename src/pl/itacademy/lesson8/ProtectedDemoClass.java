package pl.itacademy.lesson8;

import pl.itacademy.lesson8.protecteddemo.DemoClass;

public class ProtectedDemoClass extends DemoClass {
    public void doSomething() {
        DemoClass demo = new DemoClass();

        //demo.packageDefaultInt =1;
        //demo.protectedInt = 1;
        demo.publicInt = 20;
        //demo.privateInt = 1;

        //demo.privateMethod();
        //demo.packageDefaultMethod();
        //demo.protectedMethod();
        demo.publicMethod();

        ProtectedDemoClass protectedDemo = new ProtectedDemoClass();
        //protectedDemo.packageDefaultInt =1;
        protectedDemo.protectedInt = 1;
        //protectedDemo.packageDefaultMethod();
        protectedDemo.protectedMethod();
    }
}
