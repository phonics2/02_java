package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	
	public void fileSave(String 파일이름) {
		//File 객채 생성해서 파일생성하기
		File file = new File(파일이름);
		
		try {
			//파일에 write 하기 위해 FileWriter 객체 불러오기
			FileWriter fw = new FileWriter(file);
			
			//파일을 읽고 쓰기 위해서 BufferedWriter 객체 불러오기
			BufferedWriter bw = new BufferedWriter(fw);
			Person 사람 = new Person("김영희",10);
			bw.write(사람.toString());
			
			//다쓴후 저장하기
			bw.close();
			System.out.println("파일이 저장됨.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		pm.fileSave("person.txt");
	}
}
