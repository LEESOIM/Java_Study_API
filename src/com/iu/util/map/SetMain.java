package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {

// Set	
//	- 순서가 유지 X
//	- 값의 중복을 허용 X
//	- get X
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add(10); //중복
		
		System.out.println(hashSet.size()); //2
		
		
		Iterator<Integer> iterator = hashSet.iterator();//iterator() : 데이터들을 나열해서 담고있다
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //Integer를 모아놨기때문에 Integer가 나옴
		}
	}

}
