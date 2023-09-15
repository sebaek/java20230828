package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C12writer {
    public static void main(String[] args) {
        String path = "C:/Temp/out4.txt";
        try (Writer writer = new FileWriter(path)) {
            writer.write('손'); // char는 int로 자동형변환됨
            writer.write('흥');
            writer.write(48124);

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
