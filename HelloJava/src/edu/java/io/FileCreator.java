package edu.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileCreator {
	public static void main(String[] args) {
		// 파일을 만들거임 => 외부로 내본ㄹ거임
		OutputStream os = null;

		try {
			os = new FileOutputStream("C:/data/bigfile.dat");
			byte[] buffer = new byte[4096];
			for (int i = 0; i < buffer.length; i++) {
				buffer[i] = (byte) 1;
				// buffer를 만든것임 // 이거는 아래에 넣기위해서
			}
			for (int i = 0; i < 150000000; i++) {
				os.write(buffer);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

		}
	}

}
