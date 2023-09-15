package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C07inputStream {
    public static void main(String[] args) {
        String path = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(path)) {
            int read = is.read();
            int read1 = is.read();
            int read2 = is.read();

            System.out.println("read = " + read); // 65
            System.out.println("read1 = " + read1); // 66
            System.out.println("read2 = " + read2); // 67
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
