package pl.itacademy.lesson15;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List strings = new ArrayList();

        strings.add("Hello");
        strings.add("Word");

        System.out.println(strings);

        strings.add(5);
        strings.add('A');

        System.out.println(strings);

        String hello = (String) strings.get(0);
        System.out.println(hello);

        for (Object string : strings) {
            if(string instanceof String) {
                String s = (String) string;
            } else if (string instanceof Integer) {
                Integer i = (Integer) string;
            }
        }

        List<String> genericStrings = new ArrayList<>();
        genericStrings.add("Hello");
        genericStrings.add("Generics!");

        String generics = genericStrings.get(1);
        System.out.println(generics);
    }
}
