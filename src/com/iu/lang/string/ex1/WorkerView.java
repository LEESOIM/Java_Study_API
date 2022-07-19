package com.iu.lang.string.ex1;

public class WorkerView {
	
	//view메서드
	//WorkerDTO들을 받아서 정보 출력
	public void view(WorkerDTO [] workerDTOs) {
		for(WorkerDTO dto:workerDTOs) {
			System.out.println("이름 : " + dto.getName());
			System.out.println("부서 : " + dto.getDepartment());
			System.out.println("직급 : " + dto.getJob());
			System.out.println("번호 : " + dto.getPhone());
			System.out.println("---------------");
		}
	}
}
