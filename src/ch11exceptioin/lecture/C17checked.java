package ch11exceptioin.lecture;

public class C17checked {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
