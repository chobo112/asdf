//package exam.java.project;
//
//import java.awt.BorderLayout;
//import java.io.IOException;
//import java.net.Socket;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//import javax.swing.SwingUtilities;
//
//public class ChatGUI {
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("채팅 프로그램");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(400, 300);
//
//            JTextArea chatArea = new JTextArea();
//            chatArea.setEditable(false);
//
//            JTextField messageField = new JTextField();
//            JButton sendButton = new JButton("전송");
//
//            JPanel inputPanel = new JPanel();
//            inputPanel.setLayout(new BorderLayout());
//            inputPanel.add(messageField, BorderLayout.CENTER);
//            inputPanel.add(sendButton, BorderLayout.EAST);
//
//            frame.setLayout(new BorderLayout());
//            frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
//            frame.add(inputPanel, BorderLayout.SOUTH);
//
//            // 서버와의 통신을 위한 소켓 생성
//            final String serverAddress = "localhost";
//            final int serverPort = 13747;
//            Socket socket = null;
//
//            try {
//                socket = new Socket(serverAddress, serverPort);
//
//                // 서버로부터 메시지를 읽는 스레드 실행
//                ReadThread readThread = new ReadThread(socket);
//                new Thread(readThread).start();
//
//                // 서버로 메시지를 전송하는 스레드 실행
//                WriteThread writeThread = new WriteThread(socket);
//                new Thread(writeThread).start();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            sendButton.addActionListener(e -> {
//                String message = messageField.getText();
//                if (!message.isEmpty()) {
//                    // GUI에 메시지 추가
//                    chatArea.append("나 : " + message + "\n");
//
//                    // 서버로 메시지 전송
//
//                    messageField.setText("");
//                }
//            });
//
//            frame.setVisible(true);
//        });
//    }
//}