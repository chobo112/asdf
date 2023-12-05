package Facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

	private Database() {
	}

	// 데이터베이스 이름에서 Properties를 알 수 있다.
	public static Properties getProperties(String dname) throws IOException {
		String filenmae = 
				"D:\\eclipse_workspace\\Design"
				+ "\\src\\Facade\\pagemaker\\maildata.txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filenmae));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	// setting Properties로 만들면 상수값을 밖으로 꺼낼 수가 있다?
	// Properties들을 외부로 빼놓고 사용하는 느낌이다. Properties라는 파일이 존재한다 라는 개념
}
