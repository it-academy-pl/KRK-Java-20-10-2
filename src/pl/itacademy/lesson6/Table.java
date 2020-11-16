package pl.itacademy.lesson6;

public class Table {
    private String colour;
    private String material;
    private int height;
    private int numberOfLegs;
    private boolean readyToUse;

    public void setColour(String newColour) {
        colour = newColour;
    }

    public String getColour() {
        return colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isReadyToUse() {
        return readyToUse;
    }

    public void setReadyToUse(boolean readyToUse) {
        this.readyToUse = readyToUse;
    }
}
