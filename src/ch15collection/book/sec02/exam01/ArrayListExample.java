package ch15collection.book.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println("size = " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();
        // 향상된 for
        // foreach
        System.out.println("foreach 사용1");
        list.forEach(e -> System.out.println(e.getSubject() + "\t" + e.getContent() + "\t" + e.getWriter()));

        System.out.println();

        System.out.println("foreach 사용2");
        list.forEach(System.out::println);
//        list.forEach(e -> System.out.println(e));
//        list.forEach(e -> System.out.println(e.toString()));

        System.out.println();


        // 0, 1, 2, 3, 4

        list.remove(2);

        // 0, 1, 2, 3
        list.remove(2);

        // 0, 1, 2
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }

    }
}
