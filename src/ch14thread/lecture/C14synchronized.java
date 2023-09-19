package ch14thread.lecture;

public class C14synchronized {
}

class MyBox14 {
    private int value;

    public MyBox14(int value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
