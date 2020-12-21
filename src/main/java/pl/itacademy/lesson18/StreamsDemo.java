package pl.itacademy.lesson18;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        Pencil red = new Pencil("red", "Colorino", Pencil.Softness.B);
        Pencil gray = new Pencil("gray", "Colorino", Pencil.Softness.BB);
        Pencil blue = new Pencil("blue", "Parker", Pencil.Softness.H);
        Pencil yellow = new Pencil("yellow", "Parker", Pencil.Softness.HB);
        Pencil black = new Pencil("black", "Kohinor", Pencil.Softness.HH);
        Pencil orange = new Pencil("orange", "Kohinor", Pencil.Softness.HB);

        List<Pencil> pencils = List.of(red, gray, blue, yellow, black, orange);

        List<String> colours = pencils.stream()
                .filter(pencil -> pencil.getColour().startsWith("b"))
                .map(pencil -> pencil.getColour())
                .collect(Collectors.toList());

        System.out.println(colours);

        Stream<Pencil> streamOfPencils = pencils.stream();
        Stream<String> streamOfNames = streamOfPencils.map(pencil -> pencil.getName());
        Stream<String> endingWithRStream = streamOfNames.filter(name -> name.endsWith("r"));
        Set<String> setOfNames = endingWithRStream.collect(Collectors.toSet());

        System.out.println(setOfNames);

//        List<String> listOfNames = endingWithRStream.collect(Collectors.toList());
//        System.out.println(listOfNames);

        System.out.println("=================================================");

        long count = pencils.stream()
                .peek(pencil -> System.out.println(pencil))
                .filter(pencil -> pencil.getSoftness().getHardness() >= 0)
                .peek(pencil -> System.out.println(pencil))
                .map(pencil -> pencil.getColour())
                .peek(pencil -> System.out.println(pencil))
                .count();
        System.out.printf("There was %d pencils after streaming%n", count);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        pencils.stream()
                .filter(pencil -> pencil.getSoftness().getHardness() >= 0)
                .map(pencil -> pencil.getColour())
                .forEach(pencil -> System.out.println(pencil));

        System.out.println("-------------------------------------------");
        Optional<String> first = pencils.stream()
                .filter(pencil -> pencil.getSoftness().getHardness() >= 0)
                .map(pencil -> pencil.getColour())
                .findFirst();

        System.out.println(first);
    }
}
