package pl.itacademy.lesson8;

public class Mouse extends Animal {
    protected boolean hungry = true;
    @Override
    public void eat(String food) {
        System.out.println("Mouse is eating " + food + " in it's hole");
        hungry = false;
    }

    public void hideFromCat() {
        System.out.println("Mouse been hide in it's hole");
    }
}
