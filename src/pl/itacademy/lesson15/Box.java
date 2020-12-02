package pl.itacademy.lesson15;

public class Box<T> {
    private T item;

    void putItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    boolean isEmpty() {
        return item == null;
    }
}
