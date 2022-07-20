package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	//ex1
	//스캐너로부터 주민번호 입력 받음 앞6-뒤7 930623-20 
	//1. 남자(1,3) 여자(2,4) 판단
	//2. 현재 나이 출력
	//3. 3~5월 : 봄
	//	 6~8월 : 여름
	//	 9월~11월 : 가을
	//	 12월~2월 : 겨울
	
	public void ex1() {
		System.out.println("주민번호 입력"); //930623-2
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		
		String gender = jumin.substring(7,8);
		String month = jumin.substring(2,4);
		
		int genderInt = Integer.parseInt(gender);
		int monthInt = Integer.parseInt(month);
		
		
		if(genderInt == 1 || genderInt == 3) {
			System.out.println("남자 🧑");
			age(jumin);
		}else if(genderInt == 2 || genderInt == 4){
			System.out.println("여자 👩");
			age(jumin);
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		if(2<monthInt && monthInt<6) {
			System.out.println("3~5월 : 봄");
		} else if(5<monthInt && monthInt<9) {
			System.out.println("6~8월 : 여름");
		} else if(8<monthInt && monthInt<12) {
			System.out.println("9월~11월 : 가을");
		} else if(monthInt==12||monthInt==1||monthInt==2) {
			System.out.println("12월~2월 : 겨울");
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
//		gender(jumin);
		
	}
	
	
	private void age(String jumin) {
		
		int year = Integer.parseInt(jumin.substring(0, 2));
		int num = Integer.parseInt(jumin.substring(0, 2));
		
		if(num < 23) {
			year = 22-year+1;
			System.out.println(year+"세");
			
		}else {
			year = 122-year+1;
			System.out.println(year+"세");
		}
	}
	
	
//	private void gender(String jumin) {
//		char ch = jumin.charAt(7); //문자로 반환
//		if(ch=='1' || ch=='3') { 
//			System.out.println("남자 🧑");
//		}else {
//			System.out.println("여자 👩");
//		}
//	}
	
	
}
