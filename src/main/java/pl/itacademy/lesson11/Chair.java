package pl.itacademy.lesson11;

public class Chair {
    private String material;
    private int height;
    private int weight;
    private boolean withWheels;

    public Chair(String material, int height, int weight, boolean withWheels) {
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.withWheels = withWheels;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isWithWheels() {
        return withWheels;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Chair)) {
            return false;
        }
        Chair another = (Chair) obj;

        if (!material.equals(another.material)) {
            return false;
        }
        if (height != another.height) {
            return false;
        }
        if (withWheels != another.withWheels) {
            return false;
        }
        if (weight != another.weight) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return height * weight;
    }

    @Override
    public String toString() {
        return "A Chair with Material: " + material + " height: " + height;
    }

    //DO NOT Repeat at home please :)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Oh no, " + material + " chair been destroyed :'( !");
    }
}
