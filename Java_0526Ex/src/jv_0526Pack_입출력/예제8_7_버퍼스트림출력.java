package jv_0526Pack_입출력;
import java.io.*;
import java.util.Scanner;

//버퍼 크기를 5로 하고, 표준 출력 스트림(System.out)과 연결한 버퍼 출력 스트림을 생성하라. 
//c:\Temp\test2.txt 파일을 저장된 영문 텍스트를 읽어 버퍼 출력 스트림을 통해 출력하라.

public class 예제8_7_버퍼스트림출력 {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = new 			
					BufferedOutputStream(System.out, 5);
			while ((c = fin.read()) != -1) { 
				out.write(c);
			}

			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine(); 
			out.flush(); // 버퍼에 남아 있던 문자 모두 출력
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
