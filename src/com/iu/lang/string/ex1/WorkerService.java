package com.iu.lang.string.ex1;

public class WorkerService {
	
	//private String info;
	private StringBuffer sb;
	
	//기본생성자
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
		sb.append(", 소임-IT-CEO-0105555");
	}	
	
	public WorkerDTO [] init() {
		//info에 있는 데이터를 파싱해서 WorkerDTO에 대입
		//WorkerDTO를 모은 배열을 리턴
		
		String info = sb.toString(); //객체의 주소를 문자열로 반환
		info = info.replace(",", "-");
		String [] infos = info.split("-");
		
		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];

		for(int i=0;i<infos.length;i++) {
			
			WorkerDTO dto = new WorkerDTO();
			
			workerDTOs[i/4] = dto;
			
			dto.setName(infos[i].trim()); 			//0 4 8
			dto.setDepartment(infos[++i].trim()); 	//1 5 9
			dto.setJob(infos[++i].trim()); 			//2 6 10
			dto.setPhone(infos[++i].trim()); 		//3 7 11
		}

		return workerDTOs;
	}
 	
}
