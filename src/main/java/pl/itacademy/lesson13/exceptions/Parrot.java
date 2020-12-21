package pl.itacademy.lesson13.exceptions;

public class Parrot extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("Parrot is eating " + food);
    }
}
