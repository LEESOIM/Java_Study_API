package com.iu.lang.string;

public class StringStudy3 {
	
	public void studySplit() {
	
		//String 객체 만드는 방법 2가지
		String str = "iu,suji,choa,hani";
		//String str2 = new String("");
		
		String [] names = str.split(","); // 쉼표 기준으로 분리
		
		//for문 -> for(초기식;조건식;증감식){}
//		for(int i=0;i<names.length;i++) {
//			String name = names[i];
//		}
		
		//향상된 for문 -> for(배열에모은데이터타입 변수명:배열참조변수명){}
		for(String name:names) {
			System.out.println(name);
		}
		
	}
	
	public void studySplit2() {
		String info = "1993 06 23";
		String [] date = info.split(" ");
		for(String d:date) {
			System.out.println(d);
		}
	}
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		info = info.replace(",", "-");
		String [] area = info.split("-");
		for(String a:area) {
			System.out.println(a);
		}
		
	}
	
}
