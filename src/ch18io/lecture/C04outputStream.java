package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04outputStream {
    public static void main(String[] args) {
        String path = "C:/Temp/out1.txt";
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(70); // 1byte
            os.write(71); // 1byte
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료!");


    }
}
