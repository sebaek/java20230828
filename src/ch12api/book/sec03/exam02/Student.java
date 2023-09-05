package ch12api.book.sec03.exam02;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (no != student.no) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = no;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
