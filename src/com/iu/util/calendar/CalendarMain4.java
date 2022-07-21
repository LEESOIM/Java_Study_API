package com.iu.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime()); 
		
//		ca.roll(Calendar.MINUTE, 20); 해당필드(20분)만 흐름, 시는 안 흐름
		ca.add(Calendar.MINUTE, 20); //분도 흐르고 시도 흐르고(다른 필드에 영향 O)
		System.out.println(ca.getTime());
		
		
		
		System.out.println("--------------------");
		ca = Calendar.getInstance();  //현재시간을 담는다
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		String time = sd.format(ca.getTime()); 
		System.out.println(time);
		
	}

}
