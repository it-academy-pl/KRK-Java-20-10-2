package pl.itacademy.lesson13.exceptions;

public class FoodNotFoundException extends Exception {
    public FoodNotFoundException(String message) {
        super(message);
    }
}
