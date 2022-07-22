package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	public void write() throws Exception {
		File file = new File("C:\\study", "test.txt");
		FileWriter fw = new FileWriter(file);//false:덮어쓰기(default) true:이어쓰기
		
		fw.write("옹오오오옹\r\n"); // \r:버퍼내용 다시뒤로땡겨, \n:엔터
		fw.flush(); //강제로 버퍼의 내용을 밀어냄
	}
}
