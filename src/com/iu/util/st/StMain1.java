package com.iu.util.st;

import java.util.StringTokenizer;

public class StMain1 {

	public static void main(String[] args) {
		String str = "samsung-500-lg-600-google-900-kakao-700";
		
		StringTokenizer st = new StringTokenizer(str,"-"); //자를 기준을 문자열타입으로 넣어준다
		
		System.out.println(st.countTokens()); //토큰으로 나눈 문자열 갯수
		
		while(st.hasMoreTokens()) {//토큰이 더 있는감 ?
			//parsing
			String token = st.nextToken(); //있으면 잘라와
			System.out.println(token);
		}
		
	}

}
