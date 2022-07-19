package com.iu.lang;


public class LangMain {	//모든 클래스는 Object 클래스를 상속(확장) 함, 생략가능

	public static void main(String[] args) {
		
		
		Object obj = new Object();
		String str = obj.toString(); 
		System.out.println(str); //객체의 주소를 문자열로 반환(클래스명@주소)
		
		Member member = new Member();
		str = member.toString();
		System.out.println(str);
		
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		obj = member; //다형성
		
		boolean check = car.equals(obj); // car == car2
		
		System.out.println(car);
		System.out.println(car.toString());
		System.out.println(check);
		
		
		//원래 주소값이 나와야하는데 오버라이딩으로 그냥 값이 나오게 만들어진거임.
		String name = "iu";
		System.out.println(name);
	}

}
