package lesson6;

public class Table {
    private String colour;
    private String material;
    private int height;

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
}
