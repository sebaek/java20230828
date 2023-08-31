package ch08interface.book.exercise.p06;

public class SoudableExample {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}
