package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);

            //        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            try (br; isr;) {
                String line1 = br.readLine();
                System.out.println("line1 = " + line1);

                String line2 = br.readLine();
                System.out.println("line2 = " + line2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
