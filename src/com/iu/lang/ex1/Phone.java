package com.iu.lang.ex1;

public class Phone {
	
	private int price;
	private int size;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

	
	
	//equals 메서드 오버라이딩(재정의)
	//각 멤버의 값이 같으면 true, 하나라도 틀리면 false 리턴
	//Hint : 참조변수 this
	@Override
	public boolean equals(Object obj) {
		Phone phone = (Phone)obj; 
		if(this.getPrice()==phone.getPrice() && this.getSize()==phone.getSize()) {
			return true;
		} return false;
	}
	
	
	
	

}
