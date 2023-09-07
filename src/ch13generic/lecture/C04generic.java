package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String> o1 = new MyClass04<>();
        o1.setField("java");
        String f1 = o1.getField();

        MyClass04<Integer> o2 = new MyClass04<>();
        o2.setField(3000);
        Integer f2 = o2.getField();
        int f22 = o2.getField();

        MyClass04<Long> o3 = new MyClass04<>();
        o3.setField(50000L);
        Long f3 = o3.getField();
        long f33 = o3.getField();


    }
}

class MyClass04<T> {
    private T field;

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
