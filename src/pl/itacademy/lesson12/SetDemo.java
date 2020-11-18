package pl.itacademy.lesson12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>(List.of("java", "kawa", "zabawa"));

        System.out.println(strings);

        strings.add("super");
        System.out.println(strings);

        strings.add("java");
        strings.add(null);
        System.out.println(strings);

        strings.add(null);
        System.out.println(strings);
    }
}
