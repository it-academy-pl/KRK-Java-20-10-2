package pl.itacademy.lesson10;

@FunctionalInterface
public interface Flyable {
    void fly();

    default void ground(){

    }
}
