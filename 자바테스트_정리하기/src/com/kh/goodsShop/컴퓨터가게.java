package com.kh.goodsShop;

import java.util.*;

public class 컴퓨터가게 {
	
	public static void main(String[] args) {
		
		//모든제품 HashMap
		Map<String,Integer> 모든제품 = new HashMap<>();
		//노트북 700000
		//데스크탑 20000
		//모니터 5000
		//마우스 3000
		//키보드 2000
		모든제품.put("노트북", 700000);
		모든제품.put("데스크탑", 20000);
		모든제품.put("모니터", 5000);
		모든제품.put("마우스", 3000);
		모든제품.put("키보드", 2000);
		
		System.out.println("컴퓨터 상품목록");
		//Entry 사용해서 출력
		//	Map<String,Integer> = Map.Entry< 안에 들어있는 타입이 Map과 동일해야함>
		//아이템을 하나씩 키-값으로 꺼내보기     : 안에 들어있는 아이템 보두보기
		for(Map.Entry<String,Integer> e : 모든제품.entrySet()) {
			String 제품명 = e.getKey();
			int 제품가격 = e.getValue();
			System.out.println(제품명 +" 은 "+제품가격+"원");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물품입력하기 : ");
		String 찾는물건 = sc.nextLine();
		
		System.out.println(찾는물건+"가 가게에 있습니까?");
		
		//containsKey 존재하는지 존재하지 않는지 if문 사용해서 확인 후
		if(모든제품.containsKey(찾는물건)) {
			System.out.println("네~! 존재합니다.");
		} else {
			System.out.println("현재 품절입니다.");
		}
		
	}
}
