package pl.itacademy.lesson20;

public class LombokDemo {
    public static void main(String[] args) {
        Beer beer = new Beer(500, "Zywiec", 4.5);
        System.out.println(beer);
        beer.setName("Kozel");
        System.out.println(beer);
    }
}
