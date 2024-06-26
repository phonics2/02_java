package com.kh.pizzaOrder;

import java.util.ArrayList;

public class PizzaShop2 {
	
	public static void main(String[] args) {
		//주문목록을 저장할 ArrayList
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		PizzaOrder 주문1 = new PizzaOrder("고영희","페페로니");
		주문리스트.add(주문1);
		/*
		 위에서 작성한 주문리스트와
		 밑에서 작성한 주문리스트는
		 주문을 작성한 방식과 다를뿐이지
		 동일하게 주문을 추가하는 방법임.
		 */
		
		//PizzaOrder 필수 생성자 이용해서 바로입력
		주문리스트.add(new PizzaOrder("고영희","페퍼로니"));
		주문리스트.add(new PizzaOrder("박철진","마르게리따"));
		주문리스트.add(new PizzaOrder("안영식","슈프림"));
		주문리스트.add(new PizzaOrder("고영희","파인애플"));
		주문리스트.add(new PizzaOrder("박철진","치즈"));
		System.out.println(주문리스트);
	}
}
