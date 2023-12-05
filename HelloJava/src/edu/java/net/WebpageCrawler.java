package edu.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebpageCrawler {
	
	public static void main(String[] args) {
		URL url = null;//url생성이 먼저 그다음에 커넥션을 만들건데 거기에 URL이 들어가기때문
		URLConnection urlConn = null;
		BufferedReader br = null;
		//객체를 BufferedReader만 적은 이유는 익명객체로 만들었으니까 얘만 만들어줄 변수가 필요함		
		try {
		url = new URL("http://www.google.com");
		urlConn = url.openConnection();
		br = new BufferedReader(
				new InputStreamReader(
						urlConn.getInputStream()
						)
				);
		//getInputStream으로 이미지나 그림을 가져올거임 1번
		//InputstreamReader로 이미지나 그림을 문자열로 바꿈 2번
		//BufferedReader로 더 빠르게 가져옴 3번. 쓴거와 반대로 순서는 이거고
			String readedLine = null;
			while((readedLine = br.readLine())!=null) {
				
				System.out.println(readedLine);
			}
		
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}//main

}//class
