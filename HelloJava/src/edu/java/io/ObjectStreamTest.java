package edu.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Person과 세트임
public class ObjectStreamTest {
//이걸로 텍스트열어봐야 깨짐 왜 ? txt인데 Stream으로 열었으니까.. ㅎㅎ
	public static void main(String[] args) {
		//오브젝트를 만든거임
		Person person1 = new Person("111111-1111111", "홍길동", 30);
		//오브젝트를 스트림으로 쓸거임 = 직렬화	
		
		//직렬화하는법 = 네트워크로 보내는법
		//FileOutputStream fos = new FileOutputStream("C:/data/person1.txt");
		//ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectOutputStream oos = null;//oos는 직렬화임
		
		
		ObjectInputStream ois = null;//ois는 역직렬화임
		
		try {
		//직렬화를 하는것임
		oos = new ObjectOutputStream
				(new FileOutputStream("C:/data/person1.obj"));
		oos.writeObject(person1);
		oos.flush();
		
		//ois는 역직렬화에 대한것. //파일읽어오는 부분이고
		//FileInputStream fis = new FileInputStream("C:/data/person1.obj");
		//ObjectInputStream ojs = new ObjectInputStream("C:/data/person1.obj");
		ois = new ObjectInputStream
				(new FileInputStream("C:/data/person1.obj"));
		Person person2 = (Person)ois.readObject();
		System.out.println(person2);
		
		
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		finally {
			try {
				oos.close(); 
				ois.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
		}
		
		
		
	}// main
}// 클래스
