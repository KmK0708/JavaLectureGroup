package jv_0526Pack_입출력;

//Scanner를 이용하여 키보드에서 입력받은 데이터를 c:\Temp\test.txt 파일에 저장하는 프로그램을 작성하라.
import java.io.*;
import java.util.*;

public class 예제8_4_키보드입력을_파일로저장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length()==0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\n\n",0,2);
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}
