package edu.java.message;

import java.io.Serializable;
import java.util.Date;
//클라이언트가 서버에 메세지를 보낼때 여기 제목,내용,작성일시가 나오도록 보냄

//DPO(데이터 전송에 쓰이는 기본화면임 이게)
public class Message2 implements Serializable{//직렬화
	
	public static final long serialVersionUID = 3216878312L;
	
	private String subject;	//제목
	private String content;	//내용
	private Date writedate;	//작성일시
	
	public Message2() {
	}
	
	public Message2(String subject, String content, Date writedate) {
		super();
		this.subject = subject;
		this.content = content;
		this.writedate = writedate;
		
	}

	@Override
	public String toString() {
		return "Message [subject=" + subject + ", content=" + content + ", writedate=" + writedate + "]";
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	
	
	
	
}
