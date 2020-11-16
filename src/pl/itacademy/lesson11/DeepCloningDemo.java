package pl.itacademy.lesson11;

public class DeepCloningDemo {
    public static void main(String[] args) {
        Engine diesel = new Engine("Diesel");
        Car fiat = new Car(diesel, "Fiat Ciqueciento");
        System.out.println(fiat);

        Car fiatClone = Car.copy(fiat);
        System.out.println(fiat.getName());
        System.out.println(fiat.getEngine().getName());

        System.out.println(fiatClone);
        System.out.println(fiatClone.getName());
        System.out.println(fiatClone.getEngine().getName());

        diesel.setName("Brand New Diesel");
        System.out.println(fiat.getName());
        System.out.println(fiat.getEngine().getName());


        System.out.println(fiatClone.getEngine().getName());
    }
}
