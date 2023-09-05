package ch12api.book.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = smartPhone.toString();
        System.out.println(strObj);

        System.out.println(smartPhone);
    }

}
