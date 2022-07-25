package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2(); 
//		t1.getNum();
//		t2.getAlphabet();
		//순서대로 숫자 쫙- 알파벳 쫙- 호출
		
		Thread t = new Thread(t2); //Runable
		
		//개발자가 직접 호출하는게 아니라 OS(운영체제)에게 실행 부탁!
		//스레드 때문에 동시에 번갈아가면서 출력 가능(숫자가 쉬는동안 알파벳이 출력)
		t1.start(); //상속
		t.start();  //인터페이스
	}

}
