package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        // OutputStream : 바이트단위 출력 스트림
        try {
            OutputStream os = new FileOutputStream("out.txt");
            os.write(70);
            os.write(71);
            os.write(73);

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
