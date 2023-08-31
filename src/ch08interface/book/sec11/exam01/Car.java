package ch08interface.book.sec11.exam01;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }
}
