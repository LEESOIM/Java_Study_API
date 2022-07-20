package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {

		ListView listView = new ListView();
		ArrayList ar = new ArrayList();
		
		ar.add("first"); //오브젝트타입
		ar.add(2); 		//Integer로 auto boxing -> 모든 데이터타입은 오브젝트타입이기때문에 다형성으로 인해 오토박싱
		ar.add('c'); 	//Character로 auto boxing
		ar.add(2.123); 	//Double로 auto boxing
		ar.add(null); 	//레퍼런스타입
		
		listView.view(ar);
	
		// get - 특정 index의 요소를 반환
		String n1 = (String)ar.get(0);
		int n2 = (Integer)ar.get(1);
		char n3 = (Character)ar.get(2);
		double n4 = (Double)ar.get(3);

//		다형성 : 부모자식간에, 레퍼런스타입끼리
//		형변환 : 프리미티브타입끼리
//		다형성을 통해 인티저클래스로 바꾼다음에	같은 인트에 넣는거를 오토언박싱
		
		System.out.println(ar.get(0) instanceof String); //true
		System.out.println(ar.get(1) instanceof String); //false
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
//		-------------------------------------------------------------
//		ArrayList<String> ar = new ArrayList<>();
				//데이터타입을 보장				//생략가능
		
//		String n1 = ar.get(0); //(String)을 안써줘도됨!
		
	
	}

}
