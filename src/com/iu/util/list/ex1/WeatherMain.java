package com.iu.util.list.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		//1. 클래스의 역할, 메서드의 역할, 변수의 역할
		// WeatherMain		: 프로그램 실행, Test
		// WeatherController: 관리/조종/호출
		// WeatherService	: Data 가공 -> 실제 하는일(로직)
		// WeatherView		: 받아온 정보를 출력만
		// CityDTO			: Data덩어리 -> 암고토 안함
		
		
		
		WeatherController wc = new WeatherController();
		wc.start();
		
		
//		----------------------------------------------------------		
//		CityDTO cityDTO = new CityDTO();
//		cityDTO.setName("d");
//		cityDTO.setGion(3);
//		cityDTO.setHum(33);
//		cityDTO.setStatus("비");
//		
//		CityDTO cityDTO2 = new CityDTO();
//		cityDTO2.setName("la");
//		cityDTO2.setGion(3222);
//		cityDTO2.setHum(3333);
//		cityDTO2.setStatus("비dd");
//		
//		ar.add(cityDTO); //인덱스번호에 추가(=배열)하는것이 아닌 add로 추가
//		ar.add(cityDTO2);
		
	}

}
