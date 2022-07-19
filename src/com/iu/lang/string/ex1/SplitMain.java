package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {

		WorkerService ws = new WorkerService();
		WorkerDTO [] workerDTOs = ws.init();
		
		WorkerView wv = new WorkerView();
		wv.view(workerDTOs);
		
		
		
		
		int num=10;
		String str = String.valueOf(num); //다른 데이터타입들을 String(문자열)으로 변환
		System.out.println(str+10); //1010
	}

}
