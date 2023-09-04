package ch09nested.book.exercise.p05;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };

        action.work();

        // lambda
        Action action2 = () -> System.out.println("복사를합니다.2");
        action2.work();

    }
}
