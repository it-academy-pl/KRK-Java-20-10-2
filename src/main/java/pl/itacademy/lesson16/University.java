package pl.itacademy.lesson16;


import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University() {
        faculties = new ArrayList<>();
        Faculty developers = new Faculty("Developers");
        String something = developers.name;
        faculties.add(developers);
    }

    public static class Faculty {
        private String name;

        public Faculty(String name) {
            this.name = name;
        }
    }
}
