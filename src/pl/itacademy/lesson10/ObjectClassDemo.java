package pl.itacademy.lesson10;

public class ObjectClassDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Keyboard keyboard = new Keyboard();

        System.out.println(keyboard.toString());

        Keyboard another = new Keyboard();
        System.out.println(keyboard.equals(another));

        Keyboard mitsumi = new Keyboard("Grey", 104, false);

        Keyboard clone = mitsumi.clone();
        System.out.println(clone.getColour());
        System.out.println(clone.getNumberOfKeys());
        System.out.println(clone.isWireless());
    }

}
