package ch18io.book.sec04.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("C:/Temp/test.txt")) {
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);


            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
