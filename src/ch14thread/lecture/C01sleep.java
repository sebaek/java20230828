package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("code1");
        Thread.sleep(1000);
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
