package edu.jav.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileTest {

	public static void main(String[] args) {
	//File, FileWriter, FileReader java.io에 있음 문자단위는 이걸로 사용	
	//input-outputstream은 바이트 단위니까 안되고	
		File f = new File("c:/memopad/test.txt");//예외처리해야좋음
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		FileWriter fw = null;
		try {
		 fw = new FileWriter(f);
		 fw.write("안녕하세요!");
	} catch(IOException ioe) {
		ioe.printStackTrace();
	} finally {
		try { 
			fw.close();
	} catch(IOException ioe) {
		ioe.printStackTrace();
	}
	}
		
	}
	
}

