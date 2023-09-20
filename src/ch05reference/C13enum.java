package ch05reference;

public class C13enum {
    public static void main(String[] args) {
        MyEnum v1 = MyEnum.VALUE1;
        MyEnum v2 = MyEnum.VALUE2;
        MyEnum v3 = MyEnum.VALUE3;
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.VALUE3;

        System.out.println("(v1==v2) = " + (v1 == v2));
        System.out.println("(v1==v4) = " + (v1 == v4));
        System.out.println("(v3 == v5) = " + (v3 == v5));

        System.out.println("v1.equals(v2) = " + v1.equals(v2));
        System.out.println("v3.equals(v5) = " + v3.equals(v5));



    }
}

enum MyEnum {
    // 콤마로 구분한 값 나열
    // 값의 이름 작성 관습 : UPPER_SNAKE_CASE
    VALUE1,
    VALUE2,
    VALUE3,
    MY_FIRST_VALUE
}


