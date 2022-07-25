package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;

	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("굶자..");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("떡볶이");
		dinner.add("물이나 먹어..");
		
	}
	//getFood
	//Server에서 메세지를 기다림
	//1 : 점심메뉴 중 랜덤하게 하나를 골라서 client로 전송
	//2 : 저녁메뉴 중 랜덤하게 하나를 골라서 client로 전송
	//3 : 프로그램 종료
	//그외나머지 : 잘못 입력된 번호입니다를 client로 전송
	
	public void getFood() throws Exception {
		
		
		ServerSocket serverSocket = new ServerSocket(8282);
		Socket socket = serverSocket.accept();
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;
		
		while(check) {
			
			//받음
			is = socket.getInputStream(); 
			ir = new InputStreamReader(is); 
			br = new BufferedReader(ir); 
			String message = br.readLine(); //숫자로보내든 문자로보내든 랜선을 통해 받는건 String으로 받는다
			
			int select = Integer.parseInt(message);//1문자열을 숫자로 바꿔서 비교 가능
			Random random = new Random(Calendar.getInstance().getTimeInMillis()); //.getInstance(); 현재시간을 담는다
																				//시드를 불규칙하게 주기 위해서 계속 바뀌는 시간을 이용한다
			
			if(message.equals("1")) { //2문자열 그대로 비교 가능
				int index = random.nextInt(lunch.size());
				message = lunch.get(index);
				
			}else if(select==2) {
				int index = random.nextInt(dinner.size());
				message = dinner.get(index);
				
			}else if(select==3) {
				break;
			}else {
				message = "잘못 입력해쓰요";
			}
			
			//준비
			os = socket.getOutputStream();//0과 1로 처리함
			ow = new OutputStreamWriter(os); //문자 한글자
			bw = new BufferedWriter(ow); //문자열
			
			//전송
			bw.write(message+"\r\n"); 
			bw.flush();
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
