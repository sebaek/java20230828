package ch16lambda.book.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x + y;
                System.out.println("result = " + result);
            }
        });
        
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x - y;
                System.out.println("result = " + result);
            }
        });
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
