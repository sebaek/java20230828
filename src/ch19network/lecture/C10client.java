package ch19network.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("172.30.1.81", 7000);

            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            Scanner scanner = new Scanner(System.in);

            try (scanner; bufferedWriter; writer; outputStream; socket) {

                while (true) {
                    System.out.print("입력>");
                    String chat = scanner.nextLine();
                    bufferedWriter.write(chat);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if (chat.equals("bye")) {
                        break;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
