package pl.itacademy.lesson15;

import java.math.BigDecimal;

public class BoxDemo {
    public static void main(String[] args) {
        Box withString = new Box();
        System.out.println(withString.isEmpty());
        withString.putItem("Apple");
        System.out.println(withString.isEmpty());

        String apple = (String) withString.getItem();
        System.out.println(apple);

        Box<Character> characterBox = new Box<>();
        characterBox.putItem('A');
        System.out.println(characterBox.isEmpty());
        Character a = characterBox.getItem();
        System.out.println(a);

        Box<Integer> integerBox = new Box<>();
        integerBox.putItem(42);

        System.out.println("==============================");

        Box<Integer> emptyBox = new Box<>();
        emptyBox.putItem(42);

        boolean equals = Util.compareBoxes(integerBox, emptyBox);
        System.out.println(equals);

        NumberBox<Integer> numberBox = new NumberBox<>();
        numberBox.putItem(7);
        Integer number = numberBox.getItem();

        NumberBox<Number> nb = null;
        NumberBox<Integer> ib = null;
        Box<Object> ob = null;
        Box<String> sb = null;
        doSomethingWithBox(nb);
        doSomethingWithBox(ib);
        doSomethingWithBox(ob);
//        doSomethingWithBox(sb);
        doSomethingWithBox(integerBox);
    }

    private static void doSomethingWithBox(Box<? super Integer> box) {

    }
}
