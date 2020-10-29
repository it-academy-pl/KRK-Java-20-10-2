package pl.itacademy.lesson7;

public class Door {
    private static int amount;

    private String colour;
    private String material;
    private boolean open;
    private int height;

    public Door() {
        this("brown", "wooden");
    }

    public Door(String colour, String material) {
        this.colour = colour;
        this.material = material;

        amount++;
    }

    public void open() {
        System.out.println("Door is open");
        open = true;
    }

    public void close() {
        System.out.println("Door has been closed");
        open = false;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return open;
    }

    public int getHeight() {
        return height;
    }

    public static int getAmount() {
        return amount;
    }
}
