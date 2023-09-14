package ch11exceptioin.lecture;

public class C23custom {
    public static void main(String[] args) {
        int money = 300;

        if (money < 10000) {
            throw new LackOfMoneyException();
        }
    }
}

class LackOfMoneyException extends RuntimeException {
    public LackOfMoneyException() {

    }
    public LackOfMoneyException(String message) {
        super(message);
    }
}
