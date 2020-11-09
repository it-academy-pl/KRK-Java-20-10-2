package pl.itacademy.lesson10;

public class CdDrive extends OpticalDrive {
    @Override
    public void read() {
        System.out.println("Read a Compact Disk");
    }

    @Override
    public void write() {
        System.out.println("Write a Compact Disk");
    }
}
