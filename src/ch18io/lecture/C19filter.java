package ch18io.lecture;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C19filter {
    public static void main(String[] args) {
        String src = "C:/Temp/out8.txt";

        try {
            InputStream is = new FileInputStream(src);
            Reader reader = new InputStreamReader(is);

            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
