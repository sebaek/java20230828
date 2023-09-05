package ch16lambda.book.sec05.exam03;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
        System.out.println("Member.Member(String)");
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member.Member(String, String)");
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
