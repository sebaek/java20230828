package ch18io.lecture;

import java.io.*;

public class C10copy {
    public static void main(String[] args) {
        String src = "C:/Temp/out3.txt";
        String des = "C:/Temp/out3_copy.txt";

        try (InputStream is = new FileInputStream(src);
                OutputStream os = new FileOutputStream(des)) {

            byte[] b = new byte[3];

//            int len1 = is.read(b);
//            os.write(b, 0, len1);
//
//            int len2 = is.read(b);
//            os.write(b, 0, len2);
//
//            int len3 = is.read(b);
//            os.write(b, 0, len3);
//
//            int len4 = is.read(b);
//            os.write(b, 0, len4);
//
//            int len5 = is.read(b); // -1

            int len = 0;

            while ((len = is.read(b)) != -1) {
                os.write(b, 0, len);
            }

            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
