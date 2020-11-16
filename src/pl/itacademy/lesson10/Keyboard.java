package pl.itacademy.lesson10;

public class Keyboard implements Cloneable {
    private String colour;
    private int numberOfKeys;
    private boolean wireless;

    public Keyboard() {
    }

    public Keyboard(String colour, int numberOfKeys, boolean wireless) {
        this.colour = colour;
        this.numberOfKeys = numberOfKeys;
        this.wireless = wireless;
    }

    public static Keyboard createCopy(Keyboard keyboard) {
        return new Keyboard(keyboard.colour, keyboard.numberOfKeys, keyboard.wireless);
    }

    @Override
    public Keyboard clone() throws CloneNotSupportedException {
        Keyboard clone = (Keyboard) super.clone();
        clone.colour = "Red";
        return clone;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public boolean isWireless() {
        return wireless;
    }
}
