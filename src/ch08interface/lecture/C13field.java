package ch08interface.lecture;

public class C13field {
    public static void main(String[] args) {
        System.out.println(MyInterface13.VALUE);
        System.out.println(MyInterface13.NAME);
        System.out.println(MyInterface13.HOME_ADDRESS);
    }
}

interface MyInterface13 {
    int VALUE = 30; // public static final
    public static final String NAME = "java";
    String HOME_ADDRESS = "seoul";
}
