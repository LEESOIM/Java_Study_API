package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	//juminCheck
	//스캐너로 주민번호 입력 받음
	//  9	7	1	1	2	4	-	1	2	3	4	5	6	7
	// *2	3	4	5	6	7		8	9	2	3	4	5
	// 18	21	4	5	12	28		8	18	6	12	20	30	체크용번호
	// 총합 182
	// 총합을 11로 나누어서 나머지를 구함
	// 182/11 = 몫16 나머지6
	// 나머지를 11에서 뺀 결과 체크용번호와 같은지 비교
	// 11-6=5
	// 위 연산결과가 두자리라면, 연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	
	public void juminCheck () {
		System.out.println("주민번호 입력");
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		
		jumin = jumin.replace("-","");
		String [] jumins = jumin.split("");
		
		int [] juminInt = new int [jumins.length];
		int [] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i=0;i<jumins.length;i++) {
			juminInt[i] = Integer.parseInt(jumins[i]);
		}
			
		for(int i=0;i<jumins.length-1;i++) {
			sum += juminInt[i] * check[i];
			System.out.print(juminInt[i]*check[i]+"  ");
		}
		
		System.out.println("\n총합 : " + sum);
		sum = 11-(sum % 11);
		
		boolean flag=true;
		while(flag) {
			if(sum == juminInt[12]) {
				System.out.println(">>확인 완료");
				break;
			}else if(sum > 9) {
					sum %= 10;
			}else {
					System.out.println(">>잘못된 입력");
					break;
			}
	
		}
		
		
//1. substring() : String
//		String num = jumin.substring(i, i+1);
//		int n = Integer.parseInt(num);
//2. charAt() 	 : char
//		char ch = jumin.charAt(0);			(1)
//		int n = Integer.parseInt(ch+"");	
//		String num = String.valueOf(ch);	(2)
//		int n = Integer.parseInt(num);
//		int n = Integer.parseInt(String.valueOf(jumin.charAt(0))); //(3)
		
	}
}
