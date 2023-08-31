package ch08interface.book.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();

        rc.turnOn();

        // 346 Audio class 작성
        // 346 11~13 줄 추가

        rc = new Audio();
        rc.turnOn();
    }
}
