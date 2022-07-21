package com.iu.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {

//		Calendar now = Calendar.getInstance();
//		Calendar future = Calendar.getInstance();
//		future.set(Calendar.MINUTE, 20);
//		
//		long n = now.getTimeInMillis(); //시간을 밀리세컨즈로 반환
//		long f = future.getTimeInMillis();
//		long result = f-n; 
//		System.out.println(result); //밀리세컨즈(1/1000초)
//		System.out.println(result/(1000*60)); //초

		
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(1993, 5, 23);
		
		long n = now.getTimeInMillis(); //시간을 밀리세컨즈로 반환
		long b = birth.getTimeInMillis();
		long result2 = n-b;
		System.out.println(result2); //밀리세컨즈(1/1000초)
		System.out.println(result2/(1000*60*60*24)/365); 

		
		
		Date date = now.getTime(); //getTime() : 캘린더타입을 데이터타입으로 바꿔줌
		System.out.println(date);
		Date date2 = birth.getTime();
		System.out.println(date2);
	}
}
