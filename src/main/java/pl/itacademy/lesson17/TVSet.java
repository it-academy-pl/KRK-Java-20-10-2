package pl.itacademy.lesson17;

import java.util.Objects;

public class TVSet {
    private int diagonal;
    private boolean withWiFi;
    private String brand;
    private boolean withBlueTooth;

    public TVSet(int diagonal, boolean withWiFi, String brand, boolean withBlueTooth) {
        this.diagonal = diagonal;
        this.withWiFi = withWiFi;
        this.brand = brand;
        this.withBlueTooth = withBlueTooth;
    }

    public TVSet() {
        diagonal = 27;
        withWiFi = false;
        brand = "NO BRAND";
        withBlueTooth = false;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isWithWiFi() {
        return withWiFi;
    }

    public void setWithWiFi(boolean withWiFi) {
        this.withWiFi = withWiFi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isWithBlueTooth() {
        return withBlueTooth;
    }

    public void setWithBlueTooth(boolean withBlueTooth) {
        this.withBlueTooth = withBlueTooth;
    }

    @Override
    public String toString() {
        return "TVSet{" +
                "diagonal=" + diagonal +
                ", withWiFi=" + withWiFi +
                ", brand='" + brand + '\'' +
                ", withBlueTooth=" + withBlueTooth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVSet tvSet = (TVSet) o;
        return diagonal == tvSet.diagonal &&
                withWiFi == tvSet.withWiFi &&
                withBlueTooth == tvSet.withBlueTooth &&
                Objects.equals(brand, tvSet.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagonal, withWiFi, brand, withBlueTooth);
    }
}
