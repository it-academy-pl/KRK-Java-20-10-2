package pl.itacademy.lesson19;

import java.lang.annotation.Repeatable;

@Repeatable(Schedule.class)
public @interface LessonTime {
    String begin();

    String end();
}
