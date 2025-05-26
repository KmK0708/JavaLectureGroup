package jv_0526Pack_입출력;

import java.io.*;

public class 예제8_3_한글텍스트파일읽기_문자지정잘못된경우 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\Temp\\hangle.txt");
			in = new InputStreamReader(fin,"US-ASCII");
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c = in.read()) != -1 ) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
