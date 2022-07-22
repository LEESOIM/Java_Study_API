package com.iu.exceiption;

import java.util.Random;
import java.util.Scanner;

public class Test {
	Random random = new Random();
	
	public void t4() throws Exception {
		//유치원생 프로그램
		//ㅅㅔ자리수 몰랑
		int num = 48; 
		int num2 = 82;
		int num3 = num+num2; //ㅁㄹ
		int num4 = num-num2; //ㅁㄹ
		
		if(num3>99) {
			throw new MyExciption(); //마이익셉션 객체를 만들어서 던져랏
//			throw new Exception(""); //기존꺼 사용 가능
		}
		
		if(num4<0) {
			throw new MyExciption("몰라아앙~~");
		}
	}
	
	public void t3() throws Exception {
		String str = null;
		System.out.println(str.toString()); //강제적으로 예외 발생시키기
	}
	
	public void t2() {
		String [] str = {"10", "five", "3.14", "0"};
		Scanner sc = new Scanner(System.in);
		
		for(String s : str) {
			try {
				System.out.println("숫자를 입력하세유");
				int n = sc.nextInt();
				int num = Integer.parseInt(s);
				num = n/num;
				System.out.println(num);
				
			} catch(NumberFormatException e) { //예외처리
				System.out.println("예외처리");
				
			} catch(ArithmeticException e) {
				System.out.println("수학 오류 해결");
				
			} catch(Exception e) {
				e.printStackTrace();
				
			} catch(Throwable e) {
				
			}
		}
	}
	
	
	public void t1() {
		System.out.println("t1 메서드 실행");
		
		String str = null;
		if(random.nextInt(10)%2==0) {
			str = "10";
		}
		
		int num = Integer.parseInt("10"); 
		try {
			num = num/0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("예외처리");
		}
		System.out.println("t1 메서드 종료");
	}

}
