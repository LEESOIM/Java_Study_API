package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	private Scanner sc;

	
	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daego-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	
	
	//init(초기화)메서드
	//sb에 있는 Data들을 파싱해서 CityDTO에 담아서 리턴(ArrayList)
	public void init(ArrayList<CityDTO> ar) {
		String data = sb.toString(); //객체의 주소값들을 문자열로 반환
		data = data.replace(",", "-");
		
		StringTokenizer st = new StringTokenizer(data, "-");
		
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO(); 
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			
			ar.add(cityDTO); 
		}
	}
	

	//add메서드
	//city 정보를 입력받아서 추가
	public boolean add(ArrayList<CityDTO> ar) {
		
		CityDTO cityDTO = new CityDTO();
		System.out.println(">>도시명 입력");
		cityDTO.setName(sc.next());
		System.out.println(">>온도 입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println(">>습도 입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println(">>날씨 입력");
		cityDTO.setStatus(sc.next());
		
		return ar.add(cityDTO);//위 데이터를 매개변수로 받아온 ArrayList주소에 추가
	}
	
	
		
	//remove메서드
	//도시명을 입력받아서 리스트에서 삭제
	public boolean remove(ArrayList<CityDTO> ar) {
		System.out.println(">>삭제할 도시명 입력");
		String name = sc.next().toUpperCase();
		boolean r = false;
		
		for(int i=0; i<ar.size(); i++) {
			if(name.equals(ar.get(i).getName().toUpperCase())) { 
				ar.remove(i);
				r = !r; 
				break;
			}
		}
		return r;
		
//		for(CityDTO cityDTO: ar) {//ar에서 하나 꺼내서 cityDTO에 담는다
//			if(name.equals(cityDTO.getName())) { 
//				ar.remove(cityDTO); //향샹된for문은 인덱스번호를 사용할수없기때문에 주소값이 들어있는 참조변수로 삭제시켜줌
//				break;
//			}
//		}
	}

	
	
	//find메서드
	//도시명을 입력받아서 리스트에서 검색해서 리턴
	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = null;
		System.out.println(">>검색할 도시명 입력");
		String name = sc.next().toLowerCase();

		for(CityDTO cityDTO2: ar) { //ar에서 하나 꺼내서 cityDTO2에 담는다
			if(name.equals(cityDTO2.getName().toLowerCase())) {
				cityDTO = cityDTO2;
				break;
			}
		}
		return cityDTO; 
	}
	
}
