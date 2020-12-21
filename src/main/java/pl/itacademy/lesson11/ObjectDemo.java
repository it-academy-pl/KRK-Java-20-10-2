package pl.itacademy.lesson11;

import java.util.Arrays;

public class ObjectDemo {
    public static void main(String[] args) {
        Chair fromIkea = new Chair("plastic", 120, 4, false);
        Chair chair = new Chair("plastic", 120, 4, false);

        Chair third = fromIkea;

        System.out.println(fromIkea == chair);
        System.out.println(third == fromIkea);

        System.out.println("======EQUALS========");
        System.out.println(fromIkea.equals(chair));
        System.out.println(chair.equals(null));
        System.out.println(third.equals(fromIkea));

        System.out.println(fromIkea.hashCode());
        System.out.println(chair.hashCode());
        System.out.println(third.hashCode());

        Chair fourth = new Chair("wooden", 120, 4, false);
        System.out.println(fourth.hashCode());
        System.out.println(fourth.equals(chair));

        System.out.println(fourth.getClass());

        System.out.println(fourth);
        System.out.println(third);

        System.out.println("Text: " + fromIkea);

        String test = "a" + fromIkea;
        System.out.println(test);

        String text = fromIkea.toString();

        Chair[] chairs = {fromIkea, chair, fourth};
        System.out.println(Arrays.toString(chairs));

        for (int i = 0; i < 100_000; i++) {
            Chair a = new Chair("Steel" + i, i, i, true);
        }
    }

//    Reflexive
//    a = 4;
//    a.equals(a)
//
//    Symetric
//    b = 4;
//    a.equals(b) is true => b.equals(a) also true;
//    b = 5;
//    a.equals(b) is false => b.equals(a) also false;
//
//    Transitive
//    c = 4;
//    IF a.equals(b) is true AND b.equals(c) is true => a.equals(c) also true
//    c = 6;
//    IF a.equals(b) is true AND b.equals(c) is false => a.equals(c) also false
}
