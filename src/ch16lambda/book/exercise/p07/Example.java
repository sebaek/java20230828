package ch16lambda.book.exercise.p07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];

        for (int score : scores) {
            result = operator.apply(result, score);
//            result = (result < score) ? score : result;
        }

        return result;
    }

    public static void main(String[] args) {

//        int max = maxOrMin((x, y) -> (x < y) ? y : x);

//        int max = maxOrMin((x, y) -> {
//            if (x > y) {
//                return x;
//            } else {
//                return y;
//            }
//        });

//        int max = maxOrMin((x, y) -> Math.max(x, y));

        int max = maxOrMin(Math::max);
        System.out.println("max = " + max);

//        int min = maxOrMin((x, y) -> Math.min(x, y));
        int min = maxOrMin(Math::min);
        System.out.println("min = " + min);
    }
    
}
