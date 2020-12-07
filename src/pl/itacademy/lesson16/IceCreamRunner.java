package pl.itacademy.lesson16;

public class IceCreamRunner {

    static {
        initFactory();
    }

    public static void main(String[] args) {
        IceCreamFactory factory = IceCreamFactory.getInstance();
        String iceCream = factory.getRandomIceCreamName();
        System.out.println(iceCream);
    }

    private static void initFactory() {
        IceCreamFactory factory = IceCreamFactory.getInstance();

        factory.addNewIceCreamName("Chocolate");
        factory.addNewIceCreamName("Milk");
        factory.addNewIceCreamName("Strawberry");
    }
}
