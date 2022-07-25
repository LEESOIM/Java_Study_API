package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	private Scanner sc;
	private StudentService ss;
	private StudentView sv;
	
	public StudentController() {
		sc = new Scanner(System.in);
		ss = new StudentService();
		sv = new StudentView();
	}
	
	//start메서드
	//1. 모든학생정보 출력
	//2. 학생정보검색 - getStudent
	//3. 학생정보추가 - setStudentAdd
	//4. 학생정보삭제 - setStudentDelete
	//5. 백      업 - setList 현재 리스트에있는 내용을 똑같은 파일로 덮어씌운다
	//6. 종      료
	public void start() throws Exception {
		boolean check = true;
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(check) {
			System.out.println("1.학생 정보 조회");
			System.out.println("2.학생 정보 검색");
			System.out.println("3.학생 정보 추가");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.백        업");
			System.out.println("6.종        료");
			int select = sc.nextInt();
			
			if(select==1) {
				ar = ss.getList();
				sv.veiw(ar);
				
			} else if(select==2) {
				StudentDTO dto = ss.getStudent(ar);
				if(dto != null) {
					sv.view(dto);
				} else {
					sv.view(">> 정보없음");
				}
				
			} else if(select==3) {
				ss.setStudentAdd(ar);
				sv.view(">> 추가성공");
				
			} else if(select==4) {
				int result = ss.setStudentDelete(ar);
				String message = ">> 삭제실패";
				if(result==1) {
					message = ">> 삭제성공";
				}
				sv.view(message);
				
				
			} else if(select==5) {
				int result = ss.setList(ar);
				if(result==1) {
					sv.view(">> 백업성공");
					sv.veiw(ar);
				}else {
					sv.view(">> 백업실패");
				}
				
			} else {
				sv.view(">> 프로그램종료");
				break;
			}
		}
		
	}


}
