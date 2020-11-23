package pl.itacademy.lesson12;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> strings = new HashSet<>(List.of("java", "kawa", "zabawa"));
        Set<String> strings = new LinkedHashSet<>(List.of("java", "kawa", "zabawa"));
//        Set<String> strings = new TreeSet<>(List.of("java", "kawa", "zabawa"));

        System.out.println(strings);

        strings.add("super");
        System.out.println(strings);

        strings.add("java");
        strings.add(null);
        System.out.println(strings);

        strings.add(null);
        System.out.println(strings);

        strings.add("java");
        System.out.println(strings);

        //HashSet output:       [super, null, kawa, java, zabawa]
        //LinkedHashSet output: [java, kawa, zabawa, super, null]

        TreeSet<Integer> integers = new TreeSet<>(List.of(5, 7, 1, 2, 9, 10, 0));
        System.out.println(integers);
        System.out.println(integers.ceiling(11));
        System.out.println(integers.descendingSet());
        System.out.println(integers.floor(2));

        System.out.println(integers.headSet(5, true));
        System.out.println(integers.tailSet(5, false));
        System.out.println(integers.subSet(5, 10));

        System.out.println(integers.pollFirst());
        System.out.println(integers);

        Set<Dog> dogs = new TreeSet<>(List.of(new Dog("Spike", "Bulldog"), new Dog("Killer", "Bulldog")));
        System.out.println(dogs);
    }
}
