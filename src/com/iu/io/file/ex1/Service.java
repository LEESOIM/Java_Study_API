package com.iu.io.file.ex1;

import java.util.ArrayList;

public interface Service {
	
	//StudentDAO의 getList를 호출하고 총점과 평균을 각각 계산해서 대입하고 그 List를 리턴
	public ArrayList<StudentDTO> getList() throws Exception;
	
	
	//StudentDAO의 setList를 호출하고 그 결과를 리턴
	public int setList(ArrayList<StudentDTO> ar) throws Exception;
	
	
	//찾으려고하는 학생의 번호를 입력받아서 찾은 학생을 리턴
	//없으면 null 리턴
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception;
	
	
	//삭제하려는 학생의 번호를 입력받아서 일치하는 학생 삭제
	//삭제 성공 1 리턴, 삭제 실패 0 리턴
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception;
	
	
	//데이터를 입력 받아서 학생 한명을 추가
	public int setStudentAdd(ArrayList<StudentDTO> ar) throws Exception;
	
}
