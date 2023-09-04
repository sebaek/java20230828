package ch16lambda.book.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 합니다."));

        person.action2(word -> System.out.println("'" + word + "' 라고 외칩니다."));
    }
}

class MySpeakable implements Speakable {
    @Override
    public void speak(String word2) {
        System.out.println(word2 + "라고 외칩니다.");
    }
}











