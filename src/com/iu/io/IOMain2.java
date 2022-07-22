package com.iu.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain2 {

	public static void main(String[] args) {
		InputStream is = System.in; //0과 1을 처리
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력");
		
		try {
			String message = br.readLine();
		} catch(Exception e) {
			e.printStackTrace();
		} finally { //예외가 발생하든 안하든 자원을 해제한다
			try {
				//연결된 역순으로 자원 해제
				br.close();
				ir.close();
				is.close();
			} catch(Exception e){
				
			}
		}
	}
}
