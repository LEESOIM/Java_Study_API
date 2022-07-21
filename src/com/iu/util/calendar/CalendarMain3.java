package com.iu.util.calendar;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		
		ca.set(2022, 11, 31, 23, 59, 50); //2022-12-31 23:59:50
		
		System.out.println(ca.getTime()); //getTime() : 캘린더타입을 데이터타입으로 바꿔줌
		
		long now = ca.getTimeInMillis(); //시간을 밀리세컨즈로 반환
		now = now + 10000; //10초
		
		ca.setTimeInMillis(now); //long타입에 있는 밀리세컨즈를 시간으로 변경
		System.out.println(ca.getTime());

	}

}
