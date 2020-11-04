package pl.itacademy.lesson9;

public class Football extends SportGame {

    public Football(String name) {
        super(name);
        System.out.println("Message B");
    }

    public void play() {
        System.out.println(getName() + " been played.");
    }

    @Override
    public String getName() {
        return "Football: " + super.getName();
    }

    @Override
    public Football createCopy() {
        return new Football(name);
    }

    public static void toRedeclare() {
        System.out.println("static method been redeclared");
    }

}
