package pl.itacademy.lesson15;

public class Util {
    static <T> boolean compareBoxes(Box<T> b1, Box<T> b2) {
        if(b1.isEmpty()) {
            return b2.isEmpty();
        } else {
            return b1.getItem().equals(b2.getItem());
        }
    }
}
