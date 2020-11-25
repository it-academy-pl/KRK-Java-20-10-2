package pl.itacademy.lesson13.compare;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparingObjectsDemo {
    public static void main(String[] args) {
        House one = new House(3, 50, 1, "Krakow");
        House two = new House(4, 45, 2, "Katowice");

        System.out.println(two.compareTo(one));

        TreeSet<House> houses = new TreeSet<>(List.of(one, two));
        System.out.println(houses);

        houses = new TreeSet<>(new HouseByFloorNumberComparator());
        houses.add(one);
        houses.add(two);
        System.out.println(houses);

        houses = new TreeSet<>(new HouseByFloorNumberComparator().reversed());
        houses.add(one);
        houses.add(two);
        System.out.println(houses);

        houses = new TreeSet<>(Comparator.nullsLast(new HouseByFloorNumberComparator()));
        houses.add(one);
        houses.add(two);
        houses.add(null);
        System.out.println(houses);
    }

    // compareTo rules:
    //1. Reflexive a.compareTo(a) => 0
    //2. Antisymmetric IF a.compareTo(b) returns +, b.compareTo(a) should return -
    //3. Transitive IF a.compareTo(b) returns +, AND b.compareTo(c) returns + a.compareTo(c) should return also +.
    //4. IF a.compareTo(b) == 0 AND a.compareTo(c) returns + THEN b.compareTo(c) also should return +
}
