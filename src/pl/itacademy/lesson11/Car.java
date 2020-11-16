package pl.itacademy.lesson11;

public class Car {
    private Engine engine;
    private String name;

    public Car(Engine engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public static Car copy(Car another) {
        Engine copyEngine = new Engine(another.engine.getName());
        Car copy = new Car(copyEngine, another.name);
        return copy;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }
}
