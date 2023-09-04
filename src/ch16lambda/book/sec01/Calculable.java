package ch16lambda.book.sec01;

// Functional Interface
// : 추상 메소드가 하나인 인터페이스

@FunctionalInterface // 이 인터페이스가 추상메소드가 하나인지 컴파일러를 통해 검증
public interface Calculable {
    void calculate(int x, int y);

}
