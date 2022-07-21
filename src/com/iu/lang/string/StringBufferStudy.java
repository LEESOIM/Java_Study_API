package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		
		String str1 = "max";
		String str2 = "age";
		
//		str1 = str1 + str2; //불필요한 객체 만들어짐
		
		StringBuffer sb = new StringBuffer(); //불필요한 객체 만들어지지 않음
		sb.append(str1);
		sb.append(str2); 
		sb.append(10);
		String result = sb.toString(); //객체의 주소를 문자열로 반환
		//StringBuffer타입과 String타입이 다르기 때문에 toString으로 바꿔준다
		
		System.out.println(sb);
		System.out.println(result);
//		System.out.println(sb+10);
		System.out.println(result+10);

	}

}
