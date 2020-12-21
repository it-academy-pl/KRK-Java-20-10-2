package pl.itacademy.lesson13.exceptions;

public class Animal {
    public void eat(String food) throws FoodNotFoundException {
        if (food == null || food.isEmpty()) {
            throw new FoodNotFoundException("Food can't be empty!");
        }
    }
}
