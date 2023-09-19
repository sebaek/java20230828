package ch19network.lecture;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C11server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080);) {

            while (true) {

                Socket socket = serverSocket.accept();

                Thread t = new Thread(() -> {
                    try {
                        OutputStream outputStream = socket.getOutputStream();
                        PrintStream ps = new PrintStream(outputStream);

                        try (ps; outputStream; socket;) {

                            String html = """
                                    <h1>내가 직접 만든 서버에서 보내는 html</h1>
                                    <p>문단 요소</p>
                                    <ul>
                                        <li>리스트 요소1</li>
                                        <li>리스트 요소2</li>
                                    </ul>
                                    """;

                            ps.println("http/1.1 200");
                            ps.println("content-type: text/html; charset=utf-8");
                            ps.println("content-length: " + html.getBytes().length);
                            ps.println();
                            ps.println(html);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                t.start();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
