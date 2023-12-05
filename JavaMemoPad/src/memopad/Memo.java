package memopad;

import java.io.*;

//메모가 하위느낌. 메모 패드를 상속을 해야할것 같음?
public class Memo /*extends MemoPad*/ {
	String title;//
	String text;//내용
	String date;
	File file;//has a관계?
	
	Memo(){}//기본생성자
	
	//어차피 메모에 들어갈 내용들은 이게 전부임
	Memo (String title, String text, String date) {
	this.title = title;
	this.text =text;
	this.date = date;
	this.file = new File(title+"_"+date+"txt");
	}
//	public String getTitle() { getter는 제한자를 쓸때나 쓰는거지 
//		System.out.println("제목은 : " + title);
//		return title;
//	}
//	
//	public String getText() {
//		System.out.println("내용 : " + text);
//		return text;
//	}
//	public String getDate() {
//		System.out.println("날짜 : " + date);
//		return date;
//	}
	
//	public static void main(String[] args) { //이건 메인에서 해야지 여기서 하면 안되고
//        // Memo 객체 생성
//        Memo myMemo = new Memo("제목", "내용", "2023-11-10");
//
//        // getTitle 메서드 호출
//        myMemo.getTitle();
//        myMemo.getText();
//        myMemo.getDate();
//    }

	
}