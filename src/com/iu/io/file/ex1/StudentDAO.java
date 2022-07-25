package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class StudentDAO {
	//DTO : Data Transfer Object
	//DAO : DATA Access Object
	// 		file data에 접근
	
	
	
	//1. getList
	//	 studentData 파일의 내용을 읽어서 작업
	public ArrayList<StudentDTO> getList() throws Exception {
		
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("c:\\study", "studentData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine(); //첫줄공백제거
		boolean check=true;
		
		while(check) {			
			String data = br.readLine(); //iu, 1,56,54,85 -> 한줄만불러옴!
			if(data==null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(data, ",");
			
			StudentDTO dto = new StudentDTO();
			dto.setName(st.nextToken().trim());
			dto.setNum(Integer.parseInt(st.nextToken().trim()));
			dto.setKor(Integer.parseInt(st.nextToken().trim()));
			dto.setEng(Integer.parseInt(st.nextToken().trim()));
			dto.setMath(Integer.parseInt(st.nextToken().trim()));
				  
			ar.add(dto);
		}
		return ar;
	}
	
	
	
	
	//2. setList
	//예외처리는 내부에서 처리
	//List로 받은 데이터들을 studentData.txt에다가 작성
	//기존의 내용은 삭제(덮어씌우기)
	//작성 형식은 기존 내용의 형식과 동일하게
	//1 리턴 : 성공
	//0 리턴 : 예외발생
	public int setList(ArrayList<StudentDTO> ar) {
		
		int result = 1;
		File file = new File("c:\\study", "studentData.txt"); //어디에저장할거냐
		FileWriter fw = null;
		try {
			fw = new FileWriter(file); //파일에작성할거야
			fw.write("\r\n");
			for(StudentDTO dto : ar) {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append(dto.getName()+",");
				stringBuffer.append(dto.getNum()+",");
				stringBuffer.append(dto.getKor()+",");
				stringBuffer.append(dto.getEng()+",");
				stringBuffer.append(dto.getMath());
				stringBuffer.append("\r\n");
				fw.write(stringBuffer.toString());
			}
			fw.flush();
		} catch (IOException e) { //예외발생
			e.printStackTrace();
			result = 0;
		} 
		return result;
	}
}
	

