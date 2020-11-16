package pl.itacademy.lesson7;

public class Flower {
    private String name;
    private String colour;
    private int size;
    private boolean blooming;

    public Flower(String name, String colour) {
        this(name, colour, 0);
    }

    public Flower(String name, String colour, int size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    public void addWater() {
        size++;
        blooming = size >= 5 && size <= 7;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public boolean isSmellNice() {
        return isBlooming();
    }

    public boolean isBlooming() {
        return blooming;
    }

    public int getSize() {
        return size;
    }
}
