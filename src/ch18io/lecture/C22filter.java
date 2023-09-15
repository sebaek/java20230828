package ch18io.lecture;

import java.io.*;

public class C22filter {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        OutputStream os = new FileOutputStream("");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        OutputStreamWriter osw = new OutputStreamWriter(bos);


    }
}
