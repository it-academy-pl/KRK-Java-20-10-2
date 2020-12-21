package pl.itacademy.lesson10;

public class DoorWithLockAndWindow extends Door implements Lockable, WithWindow {
    @Override
    public void lock() {
        System.out.println(TEST);
    }

    @Override
    public void unlock() {

    }

    @Override
    public void openWindow() {

    }

    @Override
    public void closeWindow() {

    }

//    @Override
//    public void replaceWindow() {
//        System.out.println("Changing window to another");
//    }
}
