package ch11exceptioin.book.exercise.p06;

public class Exercise {
    public static void main(String[] args) {
        int value = 0;
        String[] strArray = {"10", "2a"};
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println(value);
            }
        }
    }
}
