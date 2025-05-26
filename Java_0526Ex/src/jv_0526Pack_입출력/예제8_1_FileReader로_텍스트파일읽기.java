package jv_0526Pack_입출력;

import java.io.*;

// FileReader를 이용하여 c:\windows\system.ini 파일을 읽어 화면에 출력하는 프로그램을 작성하라. system.ini는 텍스트 파일이다
public class 예제8_1_FileReader로_텍스트파일읽기 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			int c;
			while((c = fin.read()) != -1 ) { // 한 문자씩 파일 읽기
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
