package pl.itacademy.lesson7;

public class CatTester {
    public static void main(String[] args) {
        Cat thomas = new Cat("Thomas");
        System.out.println(thomas.getName());
        System.out.println(thomas.isHungry());

        thomas.eat("milk");
        System.out.println(thomas.isHungry());
        thomas.eat("parówka");
        thomas.sleep(2);
        thomas.eat("parówka");
    }
}
