package pl.itacademy.lesson19;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotatedAnimalDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Animal dog = new Animal("Dog");
        Class<? extends Animal> clazz = dog.getClass();
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations) {
            if(annotation instanceof Mammal) {
                Mammal mammal = (Mammal) annotation;
                System.out.println(mammal.hunter());
            }
        }

        Cat cat = new Cat("Tom");
        Class<? extends Animal> aClass = cat.getClass();
        annotations = aClass.getAnnotations();
        for(Annotation annotation : annotations) {
            if(annotation instanceof Mammal) {
                Mammal mammal = (Mammal) annotation;
                System.out.println(mammal.hunter());
            }
        }

        Class<Animal> animalClass = Animal.class;
        Constructor<Animal> animalConstructor = animalClass.getConstructor(String.class);
        Animal parrot = animalConstructor.newInstance("Parrot");

        System.out.println(parrot.getName());

        Method setNameMethod = animalClass.getMethod("setName", String.class);
        setNameMethod.invoke(parrot, "Bird");
        System.out.println(parrot.getName());
    }
}
