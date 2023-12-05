package edu.java.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//url만들기  //이미지 끌어오기 => inputStream/파일로 만들거니까 FileOutputStream
public class WebImageCrawl {
	
	public static void main(String[] args) {
		
		URL url = null;
		URLConnection urlConn = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
		url = new URL("http://th.bing.com/th/id/OIP.ffrTtfI4Er-pyvH5mDBT8"
				+ "AHaE7?w=257&h=180&c=7&r=0&o=5&pid=1.7");
		urlConn = url.openConnection();
		
		bis = new BufferedInputStream(urlConn.getInputStream());
		//여기까지가 이미지 끌어온거
		
		bos = new BufferedOutputStream(
				new FileOutputStream("C:/data/neymar.jpg")
				);
		
		byte[] buffer = new byte[1024];//읽어들인것들 담는배열임 나가는게 아니고
		
		int readedBytes = 0;
		while((readedBytes=bis.read(buffer))!=-1) {
			//파일을 다운받았는데 -1(읽어온게없다) -1이 아닐때 적어라
			bos.write(buffer, 0,readedBytes);
		}
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
			bis.close();
			//bos.flush(); in/OutputStream애들만 써줌. 버퍼드는 안씀
			bos.close();
			
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}

}
