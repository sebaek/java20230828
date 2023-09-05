package ch16lambda.book.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

//        person.getMember1(s -> new Member(s));
        Member member1 = person.getMember1(Member::new);
        System.out.println(member1);
        System.out.println();

//        person.getMember2((a, b) -> new Member(a, b));
        Member member2 = person.getMember2(Member::new);
        System.out.println(member2);

    }
}
