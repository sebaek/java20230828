package ch18io.book.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {

            while (true) {
                int read = is.read();

                if (read == -1) {
                    break;
                }

                System.out.println("read = " + read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
