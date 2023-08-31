package ch08interface.book.exercise.p05;

public class Tv implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
    }
}
