package ch08extends.lecture.package1;

import ch08extends.lecture.MyClass30;

public class MySubClass30 extends MyClass30 {
    public void someMethod() {
        super.publicMethod();
        super.protectedMethod();
//        super.packagePrivateMethod();// 안됨
//        super.privateMethod(); // 안됨
    }
}
