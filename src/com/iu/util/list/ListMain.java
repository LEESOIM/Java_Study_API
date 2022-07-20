package com.iu.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// 1,2,3
		int [] nums = new int [3];
		nums[0]=1;
		
//		1. List -> ArrayList
//			- 순서가 유지
//			- 값의 중복을 허용
//			- 배열 기반(index 사용)
		
		ArrayList ar = new ArrayList(); 
		ar.add(1); //object타입만 들어가는데 프리미티브타입이 들어가는 이유
					//정수값 int를 Integer로 자동으로 바꿔줌 -> auto-boxing 
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(0);
		ar.add(1, "abc"); //1번 인덱스에 끼워넣는다
		
		ListView listview = new ListView();
		listview.view(ar);
		
		// remove - 특정 인덱스 번호의 요소를 삭제
		ar.remove(2);
		listview.view(ar);
		ar.remove("abc");
		listview.view(ar);
		
		// set - 특정 인덱스 번호의 요소를 수정
		ar.set(1, 'c'); //-> auto-boxing되어서 Character로 자동으로 바뀐다
		listview.view(ar);
		
		// clear - 모든 요소를 삭제
		ar.clear(); //size 0
		listview.view(ar);
	}

}
