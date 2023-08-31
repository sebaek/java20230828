package ch08interface.book.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();
        car.run();
    }
}
