package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//객체가 만들어지면 서버 오픈하고 Client의 접속을 기다림
		ServerSocket serverSocket = new ServerSocket(8282);
		System.out.println("Client 접속 기다리는중..");

		//Socket : 상대방과 1:1 통신
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		//---------------------------------------------------------
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		
		boolean check = true;
		
		while(check) {
			
			//받음
			is = socket.getInputStream(); //0과 1 처리
			ir = new InputStreamReader(is); //문자 한글자
			br = new BufferedReader(ir); //문자열
			String message = br.readLine(); //한줄읽어오기
											//숫자로보내든 문자로보내든 랜선을 통해 받는건 String으로 받는다
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			System.out.println("Client : "+message);
			
			
			//---------------------------------------------------------	
			
			
			System.out.print("Server: ");
			message = sc.next();
			
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
			
		}
		
		//자원해제
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		serverSocket.close();
	}
}
