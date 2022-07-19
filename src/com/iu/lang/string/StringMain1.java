package com.iu.lang.string;

public class StringMain1 {

	public static void main(String[] args) {

		String str1 = "iu";
		String str2 = "iu";
		
		String str3 = new String("iu");
		String str4 = new String("iu");
		
		System.out.println(str1 == str2); //메소드의 상수영역에 담기는 값이 같기 때문에 주소값도 같다
		System.out.println(str1 == str3); //메소드의 상수영역 != 힙에 새로 만들어진 인스턴스영역
		System.out.println(str3 == str4); //새로 만들어진 각 인스턴스영역
		
		System.out.println("-----------------------");
		
		System.out.println(str1.equals(str2)); //안에 있는 데이터의 내용이 같다(오버라이딩)
		System.out.println(str1.equals(str3)); //안에 있는 데이터의 내용이 같다
		
		System.out.println("-----------------------");
		StringStudy ss = new StringStudy();
		ss.studyCharAt();
		System.out.println("-----------------------");
		
		StringStudy2 ss2 = new StringStudy2();
		ss2.studyIndexOf();
		
		ss2.studyIndexOfEx1();
		
		ss2.studySubString();
		
//		ss2.ex2();
//		System.out.println("-----------------------");
		
		StringStudy3 ss3 = new StringStudy3();
		ss3.studySplit();
		System.out.println("-----------------------");
		ss3.studySplit2();
		System.out.println("-----------------------");
		ss3.studySplit3();
		

	}
}
