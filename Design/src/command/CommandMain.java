package command;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
//문자열 나누는 도구 StringTokenizer
public class CommandMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputstr = sc.nextLine();
		Command command = null;//메인의 지역변수라 초기화필요
	
		StringTokenizer st = new StringTokenizer(inputstr);
		/*if(st.hasMoreElements()) {//st다음에 요소가 있는 경우에만
			String opr=  st.nextToken(); //10이 될거고
		}
		if(st.hasMoreElements()) {//st다음에 요소가 있는 경우에만
			String opr=  st.nextToken();//20이 될거고
		}
		if(st.hasMoreElements()) {//st다음에 요소가 있는 경우에만
			String opr=  st.nextToken();//+가 될 애들
		}*/
		
		String op1="";
		String op2="";
		String opr="";
		
		if(st.hasMoreElements()) op1 = st.nextToken();
		if(st.hasMoreElements()) op2 = st.nextToken();
		if(st.hasMoreElements()) opr = st.nextToken();
		
		if(opr.equals("+")) command = new AddCommand();
		if(opr.equals("-")) command = new SubCommand();
		if(opr.equals("*")) command = new MultiCommand();
		if(opr.equals("/")) command = new DevCommand();
		
		//ke, value값이 모두 String인 맵 => 파일
		Properties prop = new Properties();
		try {
		prop.load(new FileReader("D:\\eclip"
				+ "se_workspace\\Design\\src\\Command\\command.properties"));

		Class cl = Class.forName(
				(String) prop.getProperty(opr));
		//명령어클래스이구나 ..클래스의 객체를 생성 = 명령처리클래스의 객체
		
		Command obj = (Command)cl.newInstance();
		//명령처리클래스가 오버라이딩한 calc메소드를 호출해서 연산결과를 지정
		
		float result = obj.calc(Integer.parseInt(op1), 
				Integer.parseInt(op2));
		System.out.println("결과 : "+result);

		}catch (ClassNotFoundException n) {
			n.printStackTrace();
		}catch (FileNotFoundException f) {
			f.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}

}

