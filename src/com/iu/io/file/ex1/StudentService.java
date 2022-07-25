package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	
//	*get/set메서드를 호출하기 위해서는 Service클래스안에 DAO객체가 만들어져있어야한다
	private Scanner sc;
	private StudentDAO dao; //1)변수만 선언한것(null값이 들어가있음)
	
	public StudentService() {
		this.sc = new Scanner(System.in);
		this.dao = new StudentDAO(); //2)객체를 생성 해줘야함!
	}

	
	//StudentDAO의 getList를 호출하고 총점과 평균을 각각 계산해서 대입하고 그 List를 리턴
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar = dao.getList();
		
		for(StudentDTO dto : ar) { //인덱스번호가 필요없으니 향상된for문으로 작성
			dto.setTotal(dto.getKor()+dto.getEng()+dto.getMath());
			dto.setAvg(dto.getTotal()/3.0);
		}
		return ar;
	}

	
	//StudentDAO의 setList를 호출하고 그 결과를 리턴
	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		
		return dao.setList(ar);
	}

	
	//찾으려고하는 학생의 번호를 입력받아서 찾은 학생을 리턴
	//없으면 null 리턴
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO dto = null;
		System.out.println(">> 검색할 학생 번호 입력");
		int num = sc.nextInt();
		
		for(StudentDTO dtoFind : ar) {
			if(num == dtoFind.getNum()) {
				dto = dtoFind;
				break;
			}
		}
		return dto;
	}

	
	//삭제하려는 학생의 번호를 입력받아서 일치하는 학생 삭제
	//삭제 성공 1 리턴, 삭제 실패 0 리턴
	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		int result = 0;
		System.out.println(">> 삭제할 학생 번호 입력");
		int num = sc.nextInt();
		for(StudentDTO dtoDelete : ar) {
			if(num == dtoDelete.getNum()) {
				ar.remove(dtoDelete);
				result = 1;
				break;
			}
		}
		return result;
	}

	
	//데이터를 입력 받아서 학생 한명을 추가
	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO dto = new StudentDTO();
		System.out.println(">> 학생 이름 입력");
		dto.setName(sc.next());
		System.out.println(">> 학생 번호 입력");
		dto.setNum(sc.nextInt());
		System.out.println(">> 국어 점수 입력");
		dto.setKor(sc.nextInt());
		System.out.println(">> 영어 점수 입력");
		dto.setEng(sc.nextInt());
		System.out.println(">> 수학 점수 입력");
		dto.setMath(sc.nextInt());
		dto.setTotal(dto.getKor()+dto.getEng()+dto.getMath());
		dto.setAvg(dto.getTotal()/3.0);
		
		ar.add(dto);
	}

}
