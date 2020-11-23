package pl.itacademy.lesson12;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("A", "Aa"));
        dogs.add(new Dog("B", "Ba"));
        dogs.add(new Dog("C", "Ca"));

        Dog dog = dogs.pollLast();
        System.out.println(dog);

        dog = dogs.poll();
        System.out.println(dog);
    }
}
