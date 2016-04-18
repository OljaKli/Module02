package olja.klisho.task05;

import java.util.Objects;

/**
 * Created by Ola-Mola on 17/04/16.
 */
public class Student {

    private final String name;
    private final String surname;
    private final int birthYear;


    public Student (String name, String surname, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthYear == student.birthYear &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear);
    }
}
