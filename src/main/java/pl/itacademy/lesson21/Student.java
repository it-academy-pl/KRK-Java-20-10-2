package pl.itacademy.lesson21;

import java.util.Objects;

public class Student {
    private String collegeName;

//    public Student(String firstName, String lastName, Address address, String collegeName) {
//        this.collegeName = collegeName;
//    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(collegeName, student.collegeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collegeName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "collegeName=" + collegeName +
                "} " + super.toString();
    }
}
