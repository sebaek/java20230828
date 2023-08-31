package ch07extends.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {

//        Phone p = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

        Phone phone = smartPhone;
        phone.turnOn();
        phone.turnOff();
//        phone.internetSearch(); //

    }
}
