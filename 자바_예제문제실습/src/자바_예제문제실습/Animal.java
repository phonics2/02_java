package 자바_예제문제실습;

import java.io.Serializable;

/*
 캡슐화 원칙에 맞게 구현하기
 
 //필드
 String 동물이름;
 int 나이;
 
  //메서드
   //Getter
   //Setter
 
 //기본
  * 
 //필수
 */
public class Animal implements Serializable{
//필드
	private String 동물이름;
	private int 나이;
	
//메서드
	//생성자 : 기본
	public Animal() {
		
	}
	
	//생성자 : 필수
	public Animal(String 동물이름, int 나이) {
		this.동물이름 = 동물이름;
		this.나이 = 나이;
	}
	
	//Setter
	public void set동물이름(String 동물이름) {
		this.동물이름 = 동물이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	//Getter
	public String get동물이름() {
		return 동물이름;
	}
	public int get나이() {
		return 나이;
	}
	
	@Override
	public String toString() {
		return "동물이름 : "+동물이름 +"\n나이 : "+나이 ;
	}
	
}
