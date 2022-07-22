package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//File : 파일이나 폴더의 정보를 담는 클래스
		//	   : 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("C:\\study\\test.txt");//폴더명+파일명
		file = new File("C:\\study", "test.txt");//parent:폴더, child:파일명 또는 최종폴더
		
		//1.폴더명 경로가 있는 File 객체 이용
		File path = new File("C:\\study");
		file = new File(path, "test.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory()); //false
		System.out.println(file.length());
		System.out.println("--------------");
		System.out.println(path.exists());
		System.out.println(path.isFile()); //false
		System.out.println(path.isDirectory());
		
		file = new File("C:\\study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2 = new File("C:\\study\\sub2\\t1");
//		file.mkdir(); 중간에 폴더가 없으면 노생성
		file2.mkdirs(); //여러 폴더 생성
		
		//file.delete();
		
//		file2.delete(); //t1먼저삭제하고 sub2삭제
//		File file3 = new File("C:\\study\\sub2");
//		file3.delete(); //내부가 비어있어야 가능.
	}

}
