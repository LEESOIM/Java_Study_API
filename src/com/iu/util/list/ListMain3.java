package com.iu.util.list;

import java.util.ArrayList;

import com.iu.lang.string.ex1.WorkerDTO;

public class ListMain3 {

	public static void main(String[] args) {

		WorkerDTO workerDTO = new WorkerDTO();
		WorkerDTO workerDTO2 = new WorkerDTO();
		
		ArrayList<WorkerDTO> ar = new ArrayList<>();
				//데이터타입을 보장				//생략가능
		
		ar.add(workerDTO);
		ar.add(workerDTO2);
		
		
		
		
		
//		ArrayList<String> ar1 = new ArrayList<>();
//		ArrayList<Integer> ar2 = new ArrayList<>();
//		ar1 = ar2; -> X
//		<제네릭>까지 같아야한다

	}

}
