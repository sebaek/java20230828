package ch11exceptioin.lecture;

public class C24custom {
    public static void main(String[] args) {
        int money = 300;
        if (money < 10000) {
            throw new LackOfMoneyException("돈이 부족해");
        }
    }
}
