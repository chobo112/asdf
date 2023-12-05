package edu.java.net;

import java.util.ArrayList;
import java.util.List;

public class QuizList {
	private List<Quiz> qz;

	public List<Quiz> quizListMethod() {
		List<Quiz>quzzlist = new ArrayList<Quiz>();
		for(int i = 1; i<=10; i++) {
			quzzlist.add(new Quiz("퀴즈의 문제 : "+i, "퀴즈의 정답 : " + i));
			
		}
		return quzzlist;
	}
	
	@Override
	public String toString() {
		return "QuizList [qz=" + qz + "]";
	}
	
	
//	public static void main(String[] args) {
//		QuizList quizList = new QuizList();
//		List<Quiz>quzzlist = new ArrayList<Quiz>();
//		for(int i = 1; i<=10; i++) {
//			quzzlist.add(new Quiz("퀴즈의 문제 : "+i, "퀴즈의 정답 : " + i));
//		}
//		확인용 System.out.println(quzzlist);
	
}
