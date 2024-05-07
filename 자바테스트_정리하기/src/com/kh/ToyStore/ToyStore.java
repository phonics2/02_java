package com.kh.ToyStore;

import java.util.*;

public class ToyStore {
	public static void main(String[] args) {
		//장난감 가게 재고를 HashMap 으로 표현
		//순서대로 저장x	 키는 중복 x
		Map<String,Integer> 재고 = new HashMap<>();
		재고.put("자동차", 10);
		재고.put("인형", 15);
		재고.put("공", 20);
		
		//장난감 몇개씩 재고가 남아있는지
		System.out.println("장난감 재고");
		for(Map.Entry<String,Integer> e : 재고.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}
