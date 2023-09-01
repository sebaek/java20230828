package ch08interface.book.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();

        rc.turnOn();
        rc.setVolume(1000);

        rc.setMute(true);
        rc.setMute(false);
    }
}
