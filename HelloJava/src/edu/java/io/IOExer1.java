package edu.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IOExer1 {
//io실습1  //이거는 메모장을 만들고 나서 읽어들이고 복사하는거고
	
	// 다른건 내가 출력해두고 복사해서 작성하는것을 해볼rjt
	
	
	//diary.txt 파일을 생성하고 일기 쓰고
	//diary.txt 파일을 읽어 diary_copy.txt파일로 복사하세요
	public static void main(String[] args) {
		//txt파일이니까 read나 write를 써야겠다. 생각하고
		
		Reader fr = null;
		//시스템 밖에 있으니까 불러오려면read를 쓰자
		Writer fw =null;
		try {
		fr = new FileReader("c:/data/diary.txt");
		fw = new FileWriter("C:/data/diary_copy.txt");
		//복사해서 diary2에 출력할거임
	
		//읽는방식을 정해야 하는데 어떻게 정하는지 의문 배열은 안쓸거임
		//API에서 reader로 가면 방법들이 있음 읽을 방법을 정할거니까
		
		char[] diarybuffer = new char[1024];//여기는 모르겠다.
		//API에서 char로 받으라고 써있음
//		System.out.println(diarybuffer);
		
		
		
		while(true) {//이건 배열에 받아서 빠르게 읽으려고 쓴듯
			int diarytext = fr.read(diarybuffer); //file
			if(diarytext == -1)break;
			fw.write(diarybuffer, 0, diarytext);
//			System.out.println(diarytext);
			
		}
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();//얘는read꺼임 
		} catch(IOException ioe1) {//얘는 Writer꺼
			ioe1.printStackTrace(); 
		}
		finally {
			try {
			fr.close();
			fw.close();
			//일단 꼭 닫아줘야됨 근데 호버하니까 또 오류나옴
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			}
		
	}
	
}
