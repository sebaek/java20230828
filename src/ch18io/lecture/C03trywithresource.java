package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close(); // io stream을 꼭 닫아야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {

        // try-with-resource 문법
        try (OutputStream os = new FileOutputStream("");) {

            os.write(33);
            os.write(67);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}






