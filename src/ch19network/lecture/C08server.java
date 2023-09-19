package ch19network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C08server {
    public static void main(String[] args) {
        // server가 client에게 파일 보내기
        try {

            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();

            String path = "C:/Temp/test.png";
            InputStream is = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(is);

            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (bos; os; bis; is; socket; serverSocket) {

                byte[] bytes = new byte[1024];
                int len = 0;

                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }
                bos.flush();

                System.out.println("서버가 파일을 보냈습니다 😜");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
