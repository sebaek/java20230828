package ch19network.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class C09server {
    public static void main(String[] args) {
        // 172.30.1.81
        // 7000

        System.out.println("채팅 프로그램 시작");
        try (ServerSocket serverSocket = new ServerSocket(7000);) {
            while (true) {
                try {

                    Socket socket = serverSocket.accept();

                    Thread t = new Thread(() -> {

                        try {

                            InputStream inputStream = socket.getInputStream();

                            Reader reader = new InputStreamReader(inputStream);
                            BufferedReader bufferedReader = new BufferedReader(reader);

                            try (bufferedReader; reader; inputStream; socket) {

                                String line = "";
                                SocketAddress address = socket.getRemoteSocketAddress();

                                System.out.println(address + "님이 참여합니다.");

                                while ((line = bufferedReader.readLine()) != null) {
                                    System.out.println(address + ":" + line);

                                    if (line.equals("bye")) {
                                        System.out.println(address + "님이 나갔습니다.");
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e) {
//                            e.printStackTrace();
                            System.err.println(e.getMessage());
                        }

                    });
                    t.start();
                } catch (Exception e) {
//                    e.printStackTrace();
                    System.err.println(e.getMessage());

                }


            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());

        }


    }
}
