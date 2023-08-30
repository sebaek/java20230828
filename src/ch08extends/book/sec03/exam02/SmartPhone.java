package ch08extends.book.sec03.exam02;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("SmartPhone.SmartPhone");
    }

    public SmartPhone() {
//        super("모델", "색깔");
        super("기본모델");
    }


    public SmartPhone(int a) {
        super("기본모델", "기본색깔");
    }
}
