package ch18io.book.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String origin = "C:/Temp/test.png";
        String target = "C:/Temp/test2.png";

        InputStream is = new FileInputStream(origin);
        OutputStream os = new FileOutputStream(target);

        byte[] data = new byte[1024];

        while (true) {
            int num = is.read(data);
            if (num == -1) {
                break;
            }
            os.write(data, 0, num);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");

    }
}
