package com.iu.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		//현재 년, 월, 일, 시, 분, 초, 밀리세컨즈(1/1000초)
//		Calendar ca = new GregorianCalendar(); //다형성
		Calendar ca = Calendar.getInstance(); //현재시간을 담는다
		System.out.println(ca);
			
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONDAY);//0부터 시작하기때문에 +1을 해줘야한다
		int d = ca.get(Calendar.DATE); //==DAY_OF_MONTH
		int h = ca.get(Calendar.HOUR);//(12시), HOUR_OF_DAY(24시)
		int minute = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(minute);
		System.out.println(s);
		
	}

}
