package pl.itacademy.lesson18;

import java.util.Objects;

public class Pencil {
    private String colour;
    private String name;
    private Softness softness;

    public Pencil(String colour, String name, Softness softness) {
        this.colour = colour;
        this.name = name;
        this.softness = softness;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Softness getSoftness() {
        return softness;
    }

    public void setSoftness(Softness softness) {
        this.softness = softness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pencil pencil = (Pencil) o;
        return Objects.equals(colour, pencil.colour) &&
                Objects.equals(name, pencil.name) &&
                softness == pencil.softness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, name, softness);
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", softness=" + softness +
                '}';
    }

    public enum Softness {
        BB(-2),
        B(-1),
        HB(0),
        H(1),
        HH(2);

        private int hardness;

        Softness(int hardness) {
            this.hardness = hardness;
        }

        public int getHardness() {
            return hardness;
        }
    }
}
