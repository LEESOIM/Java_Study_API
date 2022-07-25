package com.iu.thread;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() {
		this.getNum();
	}
	
	private void getNum() {
		for(int i=0; i<26; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);//0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
