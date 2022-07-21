package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) { //바이트를 모아서->char를 모아서->문자열을 모은다
		
		//키보드로부터 글자를 입력받는 순서
		InputStream is = System.in; //byte(0과 1) 처리
		
		InputStreamReader ir = new InputStreamReader(is); //한글자 처리
		
		BufferedReader br = new BufferedReader(ir); //처리한 글자를 버퍼에 모아놓는다
		
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg); //한줄 읽어오소
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
