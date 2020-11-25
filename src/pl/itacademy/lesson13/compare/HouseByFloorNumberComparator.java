package pl.itacademy.lesson13.compare;

import java.util.Comparator;

public class HouseByFloorNumberComparator implements Comparator<House> {
    @Override
    public int compare(House house1, House house2) {
        return house1.getFloorsNumber() - house2.getFloorsNumber();
    }
}
