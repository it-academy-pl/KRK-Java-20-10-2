package pl.itacademy.lesson8;

public class AnimalDemo {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Mouse mouse = new Mouse();

        mouse.eat("cheese");
        mouse.hideFromCat();

        GreyMouse mikie = new GreyMouse();
        mikie.eat("breed");
        mikie.hideFromCat();
    }
}
