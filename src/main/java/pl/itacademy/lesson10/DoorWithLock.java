package pl.itacademy.lesson10;

public class DoorWithLock extends Door implements Lockable {
    private boolean locked;

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }
}
