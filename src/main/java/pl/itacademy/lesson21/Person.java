package pl.itacademy.lesson21;

import java.util.Objects;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final Address address;

    private Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(address.getCity(), address.getStreet(), address.getZipCode());
    }

    public static Person createPerson(String firstName, String lastName, Address address){
        return new Person(firstName, lastName, address);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getStreet(), address.getZipCode());
    }

    public Person withAddress(Address newAddress) {
        return new Person(firstName, lastName, newAddress);
    }

    public Person withLastName(String newLastName) {
        return new Person(firstName, newLastName, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }
}
