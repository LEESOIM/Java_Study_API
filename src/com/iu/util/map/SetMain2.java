package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//1 - 45 중복되지 않는 숫자 6개 Set에 담아서 출력
		
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		while(hashSet.size() < 6) { //0~5
			hashSet.add(random.nextInt(45)+1); //0~44 -> 1~45
		}
		
//		for(int i=0; i<6; i++) {
//			hashSet.add(random.nextInt(45)+1);
//		}
		
	
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		System.out.println(hashSet);
		// [4, 20, 7, 9, 10, 44]

	}

}
