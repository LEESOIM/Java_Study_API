package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {

	//view 3개
	//1. String 출력
	public void view(String message) {
		System.out.println(message);
	}
	
	
	//2. StudentDTO 출력
	public void view(StudentDTO dto) {
		System.out.println("Name\tNum\t국어\t영어\t수학\tTotal\tAvg");
		System.out.println(dto.getName()+"\t"+dto.getNum()+"\t"+dto.getKor()+"\t"+dto.getEng()+"\t"+dto.getMath()+"\t"+dto.getTotal()+"\t"+dto.getAvg());
	}
	
	
	//3. ArrayList<StudentDTO> 출력
	public void veiw(ArrayList<StudentDTO> ar) {
		for(int i=0; i<ar.size(); i++) {
			StudentDTO dto = ar.get(i);
			this.view(dto);
		}
	}
}
