package ch08extends.book.sec03.exam02;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone.Phone");
    }

    public Phone(String model) {
        this.model = model;
    }
}
