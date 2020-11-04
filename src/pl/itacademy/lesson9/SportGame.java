package pl.itacademy.lesson9;

public class SportGame {
    protected String name;
    private String score;

    public SportGame(String name) {
        this.name = name;
        this.score = "0:0";
        System.out.println("Message A");
    }

    protected String getName() {
        return name;
    }

    public String getScore() {
        return getName() + " has a score " + score;
    }

    public SportGame createCopy() {
        return new SportGame(name);
    }

    public static void toRedeclare() {
        System.out.println("static method Cannot be overriden");
    }
}
