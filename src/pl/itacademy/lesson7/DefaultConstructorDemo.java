package pl.itacademy.lesson7;

import pl.itacademy.lesson6.Table;

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Door aDoor = new Door();

        System.out.println("aDoor.getColour() = " + aDoor.getColour());
        System.out.println("aDoor.getMaterial() = " + aDoor.getMaterial());
        System.out.println("aDoor.isOpen() = " + aDoor.isOpen());
        System.out.println("aDoor.getHeight() = " + aDoor.getHeight());

        aDoor.open();
        System.out.println("aDoor.isOpen() = " + aDoor.isOpen());
        aDoor.close();
        System.out.println("aDoor.isOpen() = " + aDoor.isOpen());

        System.out.println("aDoor.getAmount() = " + aDoor.getAmount());
        System.out.println("Door.getAmount() = " + Door.getAmount());

        Door anotherDoor = new Door();
        System.out.println("Door.getAmount() = " + Door.getAmount());
        System.out.println("anotherDoor.getAmount() = " + anotherDoor.getAmount());
        System.out.println("aDoor.getAmount() = " + aDoor.getAmount());


        Table table = new Table();
    }
}
