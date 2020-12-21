package pl.itacademy.lesson6;

public class ObjectsDemo {
    public static void main(String[] args) {
        Table t = new Table();
        Table t2 = t;
        Table t3 = new Table();

        Table t4 = null;

        char[] chars = new char[5];
        chars[0] = 'A';

        Double d = 5.0;

        Table table = new Table();
//        table.colour = "Green";
//        table.material = "Steel";
//        table.height = 100;
        table.setColour("Black");
        System.out.printf("Table's colour is: %s%n", table.getColour());
        table.setColour("Red");
        System.out.printf("Table's colour is: %s%n", table.getColour());

        table.setHeight(120);
        table.setMaterial("Wood");

        System.out.printf("Table colour is: %s, height is: %d, material is: %s%n",
                table.getColour(), table.getMaterial(), table.getHeight());


    }
}
