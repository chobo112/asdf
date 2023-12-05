package exam.java.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerIOThread extends Thread {
    private final Socket clientSocket;

    public ServerIOThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    //서버용 스레드가 할 @@@@@작업@@@@을 하라는거지용
    BufferedReader br = null;
    BufferedWriter bw = null;
    @Override
    public void run() {
        	
    		//IO작업을 동시에 할거임. 이거가 밑에처럼 Thread를 만들라는게 아님
    	
    	try {
    	br = new BufferedReader(
    				new InputStreamReader(
    						clientSocket.getInputStream()));
    	
    	bw = new BufferedWriter(
    			new OutputStreamWriter(
    					clientSocket.getOutputStream()));
    	String clientMessage;
    	while((clientMessage = br.readLine()) != null) {
    		System.out.println("");
    	}
    	
    	
    	} catch (IOException ioe) {
    		ioe.printStackTrace();
    	}
         
    }
}
