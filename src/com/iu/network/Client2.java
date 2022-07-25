package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	//getFood
	//서버 접속 후
	//1. 점심메뉴
	//2. 저녁메뉴
	//3. 종료
	//번호를 입력받아서 server로 전송
	//받아서 출력
	
	public void getFood() throws Exception{
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.38", 8282);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		while(check) {
			System.out.println("1. 점심메뉴");
			System.out.println("2. 저녁메뉴");
			System.out.println("3. 종   료");
			int select = sc.nextInt();
			
			//준비
			os = socket.getOutputStream();//0과 1로 처리함
			ow = new OutputStreamWriter(os); //문자 한글자
			bw = new BufferedWriter(ow); //문자열
			
			//전송
			bw.write(select+"\r\n"); //.write는 문자로 읽어들이기 때문에 String타입으로 바꿔줘야한다
									//프리미타입+문자=문자이기 때문에 바꿔줄필요(.Valueof)가 없다
			bw.flush(); 
			
			if(select==3) {
				break;
			}
			
			//받음
			is = socket.getInputStream(); //0과 1 처리
			ir = new InputStreamReader(is); //문자 한글자
			br = new BufferedReader(ir); //문자열
			String message = br.readLine(); //한줄읽어오기
			System.out.println("Server : "+message);
			
		}
		//자원해제
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		
		socket.close();
	}
}
