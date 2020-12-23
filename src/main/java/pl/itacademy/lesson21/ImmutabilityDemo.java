package pl.itacademy.lesson21;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ImmutabilityDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        SecurityManager securityManager = new SecurityManager();
//        System.setSecurityManager(securityManager);

        Address krakow = new Address("Kraków", "Opolska", "31-111");
        Address katowice = new Address("Katowice", "Powstańców Wielkoposkich", "22-111");
        Address warsaw = new Address("Warszawa", "Mickiewicza", "12-111");

        Person kowalski = Person.createPerson("Jan", "Kowalski", krakow);
        Person nowak = Person.createPerson("Anna", "Nowak", katowice);
        Person duda = Person.createPerson("Grzegorz", "Duda", warsaw);

        Map<Person, String> beerLowers = new HashMap<>();
        beerLowers.put(kowalski, "Ciemne");
        beerLowers.put(nowak, "Jasne");
        beerLowers.put(duda, "Kraftowe");

        beerLowers.entrySet().forEach(System.out::println);
        System.out.printf("Kowalski's favourite beer is: %s%n", beerLowers.get(kowalski));
        System.out.printf("Krakow's hashCode: %d%n", krakow.hashCode());
        System.out.printf("Kowalski's hashCode: %d%n", kowalski.hashCode());
        System.out.println("========================================");

        krakow.setStreet("Wrocławska");
//        kowalski.setLastName("Nowak");
        Address kowalskiAddress = kowalski.getAddress();
        kowalskiAddress.setStreet("Wrocławska");
        beerLowers.entrySet().forEach(System.out::println);

        System.out.printf("Kowalski's favourite beer is: %s%n", beerLowers.get(kowalski));
        System.out.printf("Krakow's hashCode: %d%n", krakow.hashCode());
        System.out.printf("Kowalski's hashCode: %d%n", kowalski.hashCode());
        System.out.println("========================================");

//        Student student = new Student("O", "S", krakow, "itacademy");
//        beerLowers.put(student, "bezalkoholowe");
//        beerLowers.entrySet().forEach(System.out::println);
//        System.out.printf("Student's favourite beer is: %s%n", beerLowers.get(student));
//
//        student.setCollegeName("hni");
//        System.out.printf("Student's favourite beer is: %s%n", beerLowers.get(student));

        Class<? extends Person> aClass = kowalski.getClass();
        Field firstName = aClass.getDeclaredField("firstName");
        firstName.setAccessible(true);
        firstName.set(kowalski, "Janusz");
        beerLowers.entrySet().forEach(System.out::println);
        System.out.printf("Kowalski's favourite beer is: %s%n", beerLowers.get(kowalski));

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3));
        integers.add(4);
        integers = Collections.unmodifiableList(integers);
//        integers.remove(0);

        List<Address> addresses = List.of(krakow, warsaw);
        System.out.println(addresses.hashCode());
        addresses.get(0).setStreet("abc");
        System.out.println(addresses.hashCode());

        CopyOnWriteArrayList<Address> addresses2 = new CopyOnWriteArrayList<>();
        addresses2.add(krakow);
        addresses2.add(katowice);
        addresses2.add(warsaw);

        Person newJan = kowalski.withLastName("Nowak");
        System.out.println(kowalski);
        System.out.println(newJan);

        BigDecimal one = BigDecimal.ONE;
        BigDecimal eleven = one.add(BigDecimal.TEN);
        System.out.println(one);
        System.out.println(eleven);
    }
}
