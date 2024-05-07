package com.kh.test.main.oop;
//자식클래스로 부모클래스를 상속 extends 인터페이스가 아니라 클래스를 상속 받을때는
//하나밖에 상속을 못받기 때무네 extends를 사용한 후 하나의 클래스만 작성해줘야함
public class Child extends Parent{
//필드
	int 자식변수;
	
//메서드
	//생성자 기본 ctrl space 이긴 하지만 constructor 표시가 있는 지 확인
	public Child() {
		
	}
	
	
	
	
	
	
	
	//만약에 super 를 기본생성자와 필수생성자를 불러오고 싶다면
	//		자식생성자도 두개 만들어서 각각 넣어줘야함
	public Child(int 자식변수) {
	super();// Parent 의 기본 생성자라는 의미
	//super(부모변수); 하나의 자식 생성자에서 super를 두번 부르는건 불가능
	this.자식변수 = 자식변수;
	}




	//생성자 필수 alt shift s o
				//부모변수는 Parent에서 가져올 예정
	public Child(int 부모변수 ,  int 자식변수) {
		super(부모변수); //Parent에서 필수생성자를 사용하겠다는 의미
		
		this.자식변수 = 자식변수;
	}
	
	
	
	
	
	
	
	
	public void 자식메서드() {
		super.부모메서드();
		System.out.println("자식도 호출되었습니다.");
	}


}
