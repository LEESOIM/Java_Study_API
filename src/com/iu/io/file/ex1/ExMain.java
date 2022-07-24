package com.iu.io.file.ex1;


public class ExMain {

	public static void main(String[] args) throws Exception {

//		StudentDAO dao = new StudentDAO();
//		StudentService ss = new StudentService();
//		ArrayList<StudentDTO> ar = null;
		
//		try {
//			ar = dao.getList();
//			for(StudentDTO dto : ar) {
//				System.out.println("이름 : "+dto.getName());
//				System.out.println("번호 : "+dto.getNum());
//				System.out.println("국어 : "+dto.getKor());
//				System.out.println("영어 : "+dto.getEng());
//				System.out.println("수학 : "+dto.getMath());
//				System.out.println("-----------");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		StudentController sc = new StudentController();
		sc.start();
		
		
		
	}
}
