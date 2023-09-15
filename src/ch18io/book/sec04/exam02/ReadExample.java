package ch18io.book.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("C:/Temp/test.txt")) {
            while (true) {
                int data = reader.read();

                if (data == -1) {
                    break;
                }

                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (Reader reader = new FileReader("C:/Temp/test.txt")) {
            char[] data = new char[100];

            while (true) {
                int num = reader.read(data);
                if (num == -1) {
                    break;
                }

                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
