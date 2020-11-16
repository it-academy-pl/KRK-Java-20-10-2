package pl.itacademy.lesson7;

public class ConstructorDemo {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", "Red", 5);
        Flower tulip = new Flower("Tulip", "Yellow");

        System.out.println("tulip = " + tulip.getSize());
        System.out.println("rose = " + rose.getSize());

        for (int i = 0; i < 10; i++) {
            tulip.addWater();
            System.out.println("tulip.size = " + tulip.getSize());
            System.out.println("tulip.isBlooming() = " + tulip.isBlooming());
            System.out.println("tulip.isSmellNice() = " + tulip.isSmellNice());
        }
    }
}
