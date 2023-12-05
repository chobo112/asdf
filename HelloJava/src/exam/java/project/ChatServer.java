package exam.java.project;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
//일단 금요일에는 콘솔창에다가 메세지들을 표시해서 지금 잘 작동되고 있는지를 = 완료
//눈으로 확인할수 있는 작업을 해보자 = 완료
// 꾸미기 단계 => 들어오면 이사람이 들어간거랑. 나갔을때 나간거 콘솔창에 표시되도록 해보자.


public class ChatServer {

    final static String SERVER_IP = "172.30.1.83";
    final static int SERVER_PORT = 17747;
    static ServerSocket ss = null;
    static List<ServerIOThread> clientThreads = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ss = new ServerSocket(SERVER_PORT);

            while (true) {
                Socket clientSocket = ss.accept();
                System.out.println("새로운 대화상대가 연결되었습니다.");

                ServerIOThread clientThread = new ServerIOThread(clientSocket);

                // 클라이언트 스레드를 리스트에 추가
                clientThreads.add(clientThread);

                // 스레드 시작
                clientThread.start();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (ss != null) {
                try {
                    ss.close();
                    System.out.println("[서버종료]");
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                    System.out.println("서버소켓에러");
                }
            }
        }
    }
}

//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ChatServer {
//    private final int port;
//    private final List<PrintWriter> clientWriters;
//
//    public ChatServer(int port) {
//        this.port = port;
//        this.clientWriters = new ArrayList<>();
//    }
//
//    public void start() {
//        try (ServerSocket serverSocket = new ServerSocket(port)) {
//            System.out.println("Server is listening on port " + port);
//
//            while (true) {
//                Socket clientSocket = serverSocket.accept();
//                System.out.println("New client connected");
//
//                // Create a new thread to handle the client's communication
//                new Thread(() -> handleClient(clientSocket)).start();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void handleClient(Socket clientSocket) {
//        try {
//            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
//            clientWriters.add(writer);
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//            String clientMessage;
//
//            while ((clientMessage = reader.readLine()) != null) {
//                // Broadcast the message to all clients
//                broadcastMessage(clientMessage);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // Remove the client's writer when the connection is closed
//            clientWriters.removeIf(writer -> writer.equals(clientSocket));
//            System.out.println("Client disconnected");
//        }
//    }
//
//    private void broadcastMessage(String message) {
//        for (PrintWriter writer : clientWriters) {
//            writer.println(message);
//        }
//    }
//
//    public static void main(String[] args) {
//        ChatServer server = new ChatServer(8080);
//        server.start();
//    }
//}

//클라이언트 클래스(Client2.java):
//
//java
//Copy code
//import java.io.IOException;
//import java.net.Socket;
//
//public class Client2 {
//    public static void main(String[] args) {
//        final String serverAddress = "localhost";
//        final int serverPort = 8080;
//
//        try {
//            Socket socket = new Socket(serverAddress, serverPort);
//
//            // Create and start the ReadThread
//            ReadThread readThread = new ReadThread(socket);
//            new Thread(readThread).start();
//
//            // Create and start the WriteThread
//            WriteThread writeThread = new WriteThread(socket);
//            new Thread(writeThread).start();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
