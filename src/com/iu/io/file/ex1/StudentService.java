package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service {
	
//	*get/set메서드를 호출하기 위해서는 Service클래스안에 DAO객체가 만들어져있어야한다
	private StudentDAO dao;
	public StudentService() {
		dao = new StudentDAO();
	}

	
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
