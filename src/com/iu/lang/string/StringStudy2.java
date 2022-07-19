package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void studyIndexOfEx1() {
		//1. names에는 몇개의 쉼표가 있는가?
		//2. 총 몇명입니까?
		String names = "iu,suji,choa,hani";
//		int count=0;
//		int result = names.indexOf(",", 0);
//		for(int i=0; i<names.length(); i++) {
//			result = names.indexOf(",", result+i);
//			if(result == -1) {
//				break;
//			} else {
//				count++;
//			}
//			System.out.println("index : "+result);
//		}
//		System.out.println("쉼표갯수 : "+count);
//		System.out.println("인원수 : "+(count+1));
//		System.out.println("-----------------------");
		
		boolean check = true;
		int index = 0;
		int count2 = 0;
		while(check) {
			index = names.indexOf(',', index);
			
			if(index == -1) {
				break;
			} else {
				count2++;
				index++;
			}
		}//while끝
		
		System.out.println("쉼표갯수 : "+count2);
		System.out.println("인원수 : "+(count2+1));
		System.out.println("-----------------------");
		
		
			
		
		
	}
	
	public void studyIndexOf() {
		String str = "Hello Java";
		
		int result = str.indexOf("a");
		System.out.println(result);
		
		int result2 = str.indexOf("o", 3);
		System.out.println(result2);
		System.out.println("-----------------------");
		
		String replace = str.replace('l', 'L');
		System.out.println("변경 후 : "+replace);
		System.out.println("변경 전 : "+str);
		System.out.println("-----------------------");
		
		str = "Google에 입사한다면 Google의 노예가 되겠습니다!";
		replace = str.replace("Google", "Samsung");
		System.out.println("변경 전 : "+str);
		System.out.println("변경 후 : "+replace);
		System.out.println("-----------------------");
		
		str = "hi";
		String str2 = " hi ";
		str2 = str2.trim();//문자 사이 공백은 문자로 인식
		System.out.println(str.equals(str2));
		str2 = str2.replace(" ",""); //공백칸을 없는칸으로 대체
		System.out.println(str.equals(str2));
		System.out.println("-----------------------");
		
	}
	
	
	public void studySubString() {
		//하나의 문자열을 분리하는 작업(parsing)
		String member = "iu/1234"; // 아이디/비번
		String id = member.substring(0,2); //0에서 2미만
		String pw = member.substring(3);
		System.out.println(id);
		System.out.println(pw);
		System.out.println("-----------------------");
	}
	
	
	public void ex2() {
		//키보드로부터 파일명 입력 받음 'abc.txt'
		//파일이 이미지 파일인지 아닌지 구별 '이미지파일 입니다/아닙니다'
		//확장자 jpg, png, gif, jpeg
		
		boolean check = true;
		while(check) {
			
			System.out.println("파일명을 입력하세요");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.next();
	
			int dot = fileName.lastIndexOf(".");
				
			fileName = fileName.substring(dot+1); 
			
			String [] files = {"jpg", "png", "gif", "jpeg"};
			
			String result = "❓ 이미지 파일이 아닙니다";
			
			for(int i=0; i<files.length; i++) {
				if(fileName.equals(files[i])) {
					result = "👩 이미지 파일 입니다";
					check=!check;
				}
			}
			
			System.out.println(result);
			System.out.println("파일명 : "+fileName);
			System.out.println("");
			
//			if(fileName.equals("jpg")||fileName.equals("png")||fileName.equals("gif")||fileName.equals("jpeg")) {
//				System.out.println(" 👩 이미지 파일 입니다");
//				break
//			
//			}else {
//				System.out.println(" ❓ 이미지 파일이 아닙니다");
//			}
			
//			System.out.println("파일명 : "+fileName);
//			System.out.println("");
		
		}
	}
}

