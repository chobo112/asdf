package exam.java.projectreal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread {
 private Socket socket;
 static BufferedReader br = null;
 private String clientName;
 
 public ReadThread(Socket socket, String clientName) {
    this.socket = socket;
    this.clientName =  clientName;
 }
 
 @Override//입력용 스레드의 구체적인 작업
 public void run() {
    try {  
       br = new BufferedReader(new InputStreamReader(
             socket.getInputStream()));
       while(true ) {
          String remsg = br.readLine();
          System.out.println(remsg);
    }
    
    } catch (IOException ioe) {
       ioe.printStackTrace();
    }
 
 }
 

}