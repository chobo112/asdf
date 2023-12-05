package edu.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PhotoCopyer {
	public static void main(String[] args) {
		// 내파일은 C:/data/cap.jpg 텍스트빼곤 전부 byte => fileinputStream
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:/data/cap.jpg");
			// 뒤에 경로를 정해주면서 생성자를 만든거구나.. 그리고 객체를 만든거구나
			// input은 들여오는거임 => read();전부 읽어들이는거는 read임
			os = //상위로 받자 / try밖으로 빼줌.[]
					new FileOutputStream("C:/data/bigfile.dat");//copy
			//읽은걸 전부 쓰려고 하는거고. 경로를 String으로 주는애가 있구나..
			
			byte[] buffer = new byte[1024];// 2의 배수를 씀1024가 국룰
			// buffer속도 => currentmils로 확인하면됨/여기에 byte가 담김
			//read와 관련된거 밑에서 read에서 buffer로 받으니까
			long startTime = System.currentTimeMillis();
			//buffer로 시간비교할려고(이건시작시간)
			while (true) {
				int readByteNum = is.read(buffer);
				// 1024바이트 배열단위로 읽어오겠다. //버퍼로 더 빠르게 읽으려고
				if (readByteNum == -1)break;
				// API에 보면 이게 -1이면 못읽은거
				// 와일문은 나오는게 중요함 무한루프라서
				os.write(buffer);//읽어온 buffer를 출력하는거
			}
			long endTime = System.currentTimeMillis();
			//이건 끝나는 시간
			System.out.println(endTime - startTime);
			
			//첫번째 try부분에 Exception나오는 부분이 2개였음
		} catch (FileNotFoundException fnfe) {//new FileInputStream의 예외
			fnfe.printStackTrace();
		} catch (IOException ioe) {//is.read();의 예외들
			ioe.printStackTrace();
		} finally {
			try {// close의 예외처리
				is.close();
				os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();// 호버 해두면 에러가 뜸
			}

		}

	}// main

}// class
