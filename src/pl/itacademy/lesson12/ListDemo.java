package pl.itacademy.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> anotherNumbers = List.of(8, 9, 10, 11, 12);

//        numbers.removeAll(anotherNumbers);
        numbers.retainAll(anotherNumbers);
        System.out.println(numbers);

        for (Integer number : numbers) {
            System.out.println(number + 1);
        }
        System.out.println("==================");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number - 1);
        }

        System.out.println(numbers.get(1));
        numbers.add(8);
        System.out.println(numbers);
        numbers.add(null);
        numbers.add(null);
        numbers.add(8);
        System.out.println(numbers);

        numbers.add(1, 5);
        System.out.println(numbers);

        System.out.println(numbers.indexOf(8));
        System.out.println(numbers.lastIndexOf(8));

        numbers.remove(1);
        System.out.println(numbers);

        numbers.set(1, 5);
        System.out.println(numbers);

        numbers.addAll(2, List.of(-1, -2, -3));
        System.out.println(numbers);
    }
}
