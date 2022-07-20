package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	Scanner sc;
	ArrayList<CityDTO> ar;
	WeatherService ws;
	WeatherView wv;
	
	public WeatherController() {
		sc = new Scanner(System.in);
		ar = new ArrayList<>(); //컬렉션 : 뭔가를 모으려고하는 집합. 배열처럼 쓰는것
		ws = new WeatherService();
		wv = new WeatherView();
	}

	//start메서드
	// 1. 날씨정보 초기화 - init호출
	// 2. 전국날씨 출력
	// 3. 지역날씨 검색 - 도시명검색후(find) 해당날씨출력
	// 4. 지역정보 추가
	// 5. 지역정보 삭제
	// 6. 종료
	public void start() {
		
		boolean check = true;
		
		while(check) {
			
			System.out.println("\n1. 날씨정보");
			System.out.println("2. 전국날씨 출력");
			System.out.println("3. 지역날씨 검색");
			System.out.println("4. 지역정보 추가");
			System.out.println("5. 지역정보 삭제");
			System.out.println("6. 프로그램 종료");
			
			int num = sc.nextInt();
			
			if(num==1) {
				
				System.out.println(">> 날씨정보초기화");
				ws.init(ar);
				
			}else if(num==2) {
				
				System.out.println(">> 날씨출력");
				wv.view(ar);
			
			}else if(num==3) {
				ws.find(ar);
				wv.view(ar);
				
			}else if(num==4) {
				
				ws.add(ar);
				wv.view(">> 추가완료");
				
			}else if(num==5) {
				
				ws.remove(ar);
				wv.view(">> 삭제완료");
				
			}else {
				System.out.println(">> 종료");
				break;
			}
			
		}
		
	}
}
	
