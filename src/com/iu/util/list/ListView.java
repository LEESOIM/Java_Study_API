package com.iu.util.list;

import java.util.ArrayList;

public class ListView {
	
	public void view(ArrayList ar) { //리스트를 받아서 모든 정보를 출력
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("----------");
	}
}
