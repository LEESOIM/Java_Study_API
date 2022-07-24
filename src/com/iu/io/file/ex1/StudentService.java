package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	
//	*get/set메서드를 호출하기 위해서는 Service클래스안에 DAO객체가 만들어져있어야한다
	private Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);
	}

	
	//StudentDAO의 getList를 호출하고 총점과 평균을 각각 계산해서 대입하고 그 List를 리턴
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentDAO dao = new StudentDAO();
		ar = dao.getList();
		
		for(int i=0; i<ar.size(); i++) {
			ar.get(i).setTotal(ar.get(i).getKor()+ar.get(i).getEng()+ar.get(i).getMath());
			ar.get(i).setAvg(ar.get(i).getTotal()/3);
		}
		return ar;
	}

	
	//StudentDAO의 setList를 호출하고 그 결과를 리턴
	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		StudentDAO dao = new StudentDAO();
		dao.setList(ar);
		
		return 1;
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
		System.out.println(">> 삭제할 학생 번호 입력");
		int num = sc.nextInt();
		int result = 0;
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
		dto.setAvg(dto.getTotal()/3);
		
		ar.add(dto);
	}

}
