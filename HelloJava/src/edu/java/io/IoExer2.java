package edu.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoExer2 {
//아래 내용을 포함하는 텍스트 파일을 생성하고 , 읽어서 화면에 출력하시오
	//단 조건 Buffering을 사용하세요.
	//poem.txt 
	//죽는 날까지 하늘을 우러러
	//한 점 부끄럼이 없기를
	//그 다음 몰라...
	
// 생성하니까 출력부터 텍스트니까 Writer로 쓰고 
	
	public static void main(String[] args) {
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
		String filePath = "C:/data/poem.txt";
		bw = new BufferedWriter(new FileWriter(filePath));
		bw.write("죽는 날까지 하늘을 우러러");
		bw.newLine();
		bw.write("한점 부끄럼이 없기를");
		bw.newLine();//이게 엔터를 대신함
		bw.write("그 다음 몰라...");
		bw.flush(); //쓰는 = 출력하는 계열애들은 밀어줘라io
		
		br = new BufferedReader(new FileReader(filePath));
		String line = null;
		while((line = br.readLine()) != null) {
			//readLine이 null이 아닐때까지 돌라는거임
			System.out.println(line);
			}
		} catch (IOException ioe){
			ioe.printStackTrace();
		}finally {
			try {
			bw.close();//write 출력계열은 닫아라
			br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			}
	}//main
	
}//class
