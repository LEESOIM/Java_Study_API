package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	//view메서드
	//리스트를 받아서 모든 정보를 출력
	public void view(ArrayList<CityDTO> ar) {//<CityDTO>타입을 보장
		for(int i=0; i<ar.size(); i++) {
			
			//1) ar에서 꺼내오면 기온,습도..등이 아닌 CityDTO타입이 나온다
			CityDTO cityDTO = ar.get(i); 	
			//2) CityDTO타입 안에 있는 데이터(기온,습도..등)들을 가져온다
			this.view(cityDTO); //매개변수가 같은 타입이 있는 view로 이동
		}
	}
	
	
	
	//view메서드
	//city 하나를 받아서 모든 정보를 출력
	public void view(CityDTO cityDTO) {
		System.out.println("도시 : "+cityDTO.getName());
		System.out.println("온도 : "+cityDTO.getGion());
		System.out.println("습도 : "+cityDTO.getHum());
		System.out.println("날씨 : "+cityDTO.getStatus());
		System.out.println("-----------------");
	}

	

	//view메서드
	//메세지(String) 하나를 받아서 출력
	public void view(String message) {
		System.out.println(message);
	}
}
