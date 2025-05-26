package jv_0526Pack_입출력;
import java.io.*;
//문자 스트림 FileReader와 FileWriter를 이용하여 
//c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램을 작성하라.

public class 예제8_9_텍스트파일복사 {
	public static void main(String[] args){
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("c:\\Temp\\system.txt"); // 복사 파일 경로명
		int c;
		try {
			FileReader fr = new FileReader(src); 
			FileWriter fw = new FileWriter(dest); 
			while((c = fr.read()) != -1) { // 문자 하나 읽고
				fw.write((char)c); // 문자 하나 쓰고
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
