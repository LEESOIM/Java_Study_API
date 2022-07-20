package com.iu.lang.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {

		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println("-------------");
		
		
		String num = "10";
		System.out.println(num+2); //102
		
		Integer integer = new Integer(num); 
		int n = integer.intValue();//String을 int로 변환
		System.out.println(n+2); //12
		System.out.println("-------------");
		
		
		
		n = 50;
		integer = new Integer(n); 
		
		integer = n; //auto-boxing : 정수값 int를 레퍼런스(참조)타입으로 자동으로 바꿔줌
		n = integer; //auto-unboxing : 자동으로 reference -> primitive 
		System.out.println("-------------");

		
		long l = 10L; //프리미티브 타입을 담고있다
		Long ll = l; //레퍼런스타입(주소값)을 담고있다
		
		integer = (int)l; //같은 프리미티브타입끼리만 형변환 가능
//		integer = (int)ll; //레퍼런스(주소값)에서 프리미티브로 형변환 불가능

		
		
		
		String num1 = "1"; 
		String num2 = "3.12";
		String num3 = "60";
		
		//클래스명.parse클래스명("문자열") : 문자열을 primitive type으로 변경
		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		
		System.out.println(n1*2); //2
		System.out.println(n2+1); //4.12
		System.out.println(n3*10); //600
		
		
	}

}
