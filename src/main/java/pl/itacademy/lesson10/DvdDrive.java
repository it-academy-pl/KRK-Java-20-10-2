package pl.itacademy.lesson10;

public class DvdDrive extends OpticalDrive {
    @Override
    public void read() {
        System.out.println("Read a DVD Disk");
    }

    @Override
    public void write() {
        System.out.println("Write a DVD Disk");
    }
}
