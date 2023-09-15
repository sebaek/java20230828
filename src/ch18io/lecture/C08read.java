package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";

        try (InputStream is = new FileInputStream(file);) {
            byte[] arr = new byte[3];

            int read = is.read(arr);// 3
            int read1 = is.read(arr);// 3
            int read2 = is.read(arr);// 3
            int read3 = is.read(arr);// 1
            int read4 = is.read(arr);// -1

            System.out.println("read = " + read);
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
