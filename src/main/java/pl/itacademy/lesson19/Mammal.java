package pl.itacademy.lesson19;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Inherited
public @interface Mammal {
    boolean hunter();
}
