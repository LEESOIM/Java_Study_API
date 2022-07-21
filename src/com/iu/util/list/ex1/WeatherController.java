package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	private Scanner sc;
	private WeatherService ws;
	private WeatherView wv;
	
	//결합도가 강하다(높다) : 클래서 자체에서 객체 생성
	//결합도가 느슨하다(낮다): 매개변수를 통해서 만들어어진 객체를 주입(받아옴)
	//					: 생성자의 매개변수
	public WeatherController() {
		sc = new Scanner(System.in);
		ws = new WeatherService();
		wv = new WeatherView();
	}

	//start메서드
	public void start() {
		
		ArrayList<CityDTO> ar = new ArrayList<>(); //컬렉션 : 뭔가를 모으려고하는 집합(배열처럼 쓰는것)
		boolean check = true;
		
		while(check) {
			
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 전국날씨 출력");
			System.out.println("3. 지역날씨 검색");
			System.out.println("4. 지역정보 추가");
			System.out.println("5. 지역정보 삭제");
			System.out.println("6. 프로그램 종료");
			
			int num = sc.nextInt();
			
			if(num==1) { //1. 날씨정보 초기화 - init호출
				
				System.out.println(">> 셋팅 완료\n");
				ws.init(ar);
				
			}else if(num==2) { //2. 전국날씨 출력
				
				System.out.println(">> 전국날씨\n");
				wv.view(ar);
			
			}else if(num==3) { //3. 지역날씨 검색 - 도시명검색후 해당날씨출력
				
				CityDTO cityDTO = ws.find(ar);
				
				if(cityDTO != null) {
					wv.view(cityDTO);
				} else {
					wv.view(">> 정보없음");
				}
				
			}else if(num==4) { //4. 지역정보 추가
				
				boolean result = ws.add(ar);
				String message = ">> 추가실패";
				if(result) {
					message = ">> 추가성공";
				}
				wv.view(message);
				
			}else if(num==5) {//5. 지역정보 삭제
				
				boolean result2 = ws.remove(ar);
				String message = ">> 삭제실패";
				if(result2) {
					message = ">> 삭제완료";
				}
				wv.view(message);
				
			}else { //6. 종료
				System.out.println(">> 종료");
				break;
			}
		}
	}
}
	
