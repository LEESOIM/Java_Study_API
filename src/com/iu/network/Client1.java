package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.38", 8282);
		System.out.println("Server 접속 완료");
		
		//---------------------------------------------------------
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		while(check) {
			System.out.print("Client : ");
			String message = sc.next();
			
			//준비
			os = socket.getOutputStream();//0과 1로 처리함
			ow = new OutputStreamWriter(os); //문자 한글자
			bw = new BufferedWriter(ow); //문자열
			
			//전송
			bw.write(message+"\r\n"); // \r:버퍼내용 다시땡겨, \n:엔터
			bw.flush(); //꽉차지 않으면 보내지않기 때문에 강제로 밀어내야함
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			
			//---------------------------------------------------------
			
			
			//받음
			is = socket.getInputStream(); //0과 1 처리
			ir = new InputStreamReader(is); //문자 한글자
			br = new BufferedReader(ir); //문자열
			message = br.readLine(); //한줄읽어오기
					
			if(message.equals("q")) {
				break;
			}
			
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
