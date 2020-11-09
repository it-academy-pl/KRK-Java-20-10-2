package pl.itacademy.lesson10;

public abstract class Door {
    private boolean opened;

    public void open() {
        opened = true;
    }

    public void close() {
        opened = false;
    }

    private void doSomething() {

    }
}
