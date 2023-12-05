package edu.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BufferedTest {
	
	public static void main(String[] args) {
//	1줄로 쓰면서 사라진 코드들임		
//		InputStream is = null;
//		InputStreamReader isr = null;
//		OutputStream os = null;
//		OutputStreamWriter osw = null;
		
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
//			is = new FileInputStream("C:/data/cap.jpg");//byte로 읽음
//			isr = new InputStreamReader(is);//문자로 읽음
//			//인풋스트림 리더는 보조라서 한번 거쳐야 만들어짐
//			br = new BufferedReader(isr);//이런 순서를 거쳐야함
			
			br = new BufferedReader(
					new InputStreamReader(//변환스트림쓴거임
							new FileInputStream("C:/data/cap.jpg")));
			
//			os = new FileOutputStream("C:/data/cap.jpg");
//			osw = new OutputStreamWriter(os);
//			bw = new BufferedWriter(osw);
			
			bw = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("C:/data/cap.jpg")));
			
		}catch (Exception ex){
			ex.printStackTrace();
		}finally {
			
		}
		
	}//메인

}//클래스
