package ch16lambda.book.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
//        person.ordering((a, b) -> 0);
//        person.ordering((a, b) -> a.compareToIgnoreCase(b));
        person.ordering(String::compareToIgnoreCase);
    }
}
