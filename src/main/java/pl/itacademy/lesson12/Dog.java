package pl.itacademy.lesson12;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Dog implements Comparable<Dog> {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
//        return name.length() + breed.length();
//        return name.charAt(0);
//        return 42; // The worst hashCode implementation O(n) instead of O(1)
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }
}
