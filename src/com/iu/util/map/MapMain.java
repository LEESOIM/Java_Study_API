package com.iu.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

// Map
//	- Key와 Value로 구성
//	- 순서가 유지 X
//	- Key 중복 X, Value 중복 허용
			
		HashMap<String, Integer> map = new HashMap<>();
				//오브젝트타입만 모을수있다 -> Key에 Integer를 모을거얌 
		
		System.out.println(map.size()); //0
		System.out.println(map.isEmpty()); //비어있는감? true
		System.out.println("----------");
		
		map.put("n1", 10);
		map.put("n2", 20);
		map.put("third", 30);

		System.out.println(map.size()); //3
		System.out.println(map.isEmpty()); //false
		System.out.println("----------");
		
		int num = map.get("n2");
		System.out.println(num); //20
		System.out.println("----------");
		
		
		//1. Key들을 알아내기
		boolean check = map.containsKey("n2");
		System.out.println(check);
		System.out.println("----------");
		
		
		Set<String> set = map.keySet(); //map에 있는 키들을 모아서 set에 반환
		Iterator<String> it = set.iterator(); //iterator() : 데이터들을 나열해서 담고있다
		
		//몇개가 있는지 모르니까 while문 사용
		while(it.hasNext()) { //다음 요소가 있는감?
			String key = it.next();
			System.out.println("key : " + key); 
			System.out.println("value : " + map.get(key));
		}
		System.out.println(map);
		// {n1=10, n2=20, third=30}
	}
}
