package pl.itacademy.lesson19;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {

    public static void main(String[] args) {
        @SuppressWarnings("all")
        double sum = Util.sum(1.1, 2.2);

        System.out.println(sum);

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(1);

        updateLists(firstList, secondList);
        System.out.println(firstList);
        System.out.println(secondList);
        for (Integer integer : secondList) {
            System.out.println(integer);
        }
    }

    @SafeVarargs
    private static void updateLists(List<Integer>... lists) {
        Object[] arguments = lists;
        List<Integer> firstList = (List<Integer>) arguments[0];
        firstList.add(2);
        List<String> secondList = (List<String>) arguments[1];
        secondList.add("2");
    }
}
