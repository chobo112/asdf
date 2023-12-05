package edu.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//입출력중에 Write //write니까 txt이겠구나
//또 write면 출력중에 문자열이겠구나 하면됨.
//byte(이미지나 그림관련된 문자제외 모든것들은 stream
//!!!하지만 Write이니까 출력하는 stream이나 Writer애들이 쓰는 메서드구나!!
public class WriteExample {
	
	public static void main(String[] args) {
		//output이 상위고 file이 하위임 이렇게 적는게 좋다임
			OutputStream os = null;//null값을 줘야됨 그래야 값을 초기화한줄안다.
		
			try {
			 os = new FileOutputStream("C:/data/cap.jpg");
		//OutputStream os = new FileOutputStream("C:/data/cap.jpg");
		//이렇게 적으면 뒤에 예외처리하라고 뜰거고. finally에서 못참음. 필드로 꺼내쓰자
			//try의 지역변수로 인식되서 여기 괄호를 벗어날 수가 없음
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} finally {
			try {
			os.close(); //이건 꼭 닫아줘야댕
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			}
		}
		
	}


