package exam.java.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WrongServer {
    final static String SERVER_IP = "172.30.1.83";
    final static int SERVER_PORT = 7137;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            serverSocket = new ServerSocket(SERVER_PORT);

            while (true) {
                socket = serverSocket.accept();
                System.out.println("주인장: " + socket.getInetAddress());

                br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));

                bw = new BufferedWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream(), "UTF-8"));

                while (true) {
                    String message ="";
                    	
                    if ((message=br.readLine())!= null) {
                        System.out.println("클라이언트로부터 받은 메시지: " + message);

                        // 클라이언트에게 응답 전송
                        bw.write("서버 응답: " + message);
                        bw.newLine();
                        bw.flush();
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
