package pl.itacademy.lesson13.compare;

import java.util.Objects;

public class House implements Comparable<House> {
    private int roomsNumber;
    private int area;
    private int floorsNumber;
    private String location;

    public House(int roomsNumber, int area, int floorsNumber, String location) {
        this.roomsNumber = roomsNumber;
        this.area = area;
        this.floorsNumber = floorsNumber;
        this.location = location;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return roomsNumber == house.roomsNumber &&
                area == house.area &&
                floorsNumber == house.floorsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomsNumber, area, floorsNumber);
    }

    @Override
    public String toString() {
        return "House{" +
                "roomsNumber=" + roomsNumber +
                ", area=" + area +
                ", floorsNumber=" + floorsNumber +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(House another) {
        int result = area - another.area;
        if (result == 0) {
            result = floorsNumber - another.floorsNumber;
        }
        if(result == 0) {
            result = roomsNumber - another.roomsNumber;
        }
        if(result == 0) {
            return location.compareTo(another.location);
        }

        return result;
    }
}
