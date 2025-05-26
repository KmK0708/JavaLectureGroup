package jv_0526Pack_입출력;

import java.io.FileOutputStream;
import java.io.*;
//FileOutputStream을 이용하여 byte [] 배열 속에 들어 있는 바이너리 값을 c:\Temp\test.out 파일에 저장하라. 
//이 파일은 바이너리 파일이 되므로 메모장으로 볼 수 없다. 이 파일은 예제 8-6에서 FileInputStream을 이용하여 읽어 다시 출력한다.

public class 예제8_5_fileoutputstream으로바이너리파일쓰기 {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = 
					new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			fout.close();
			} 
		catch(IOException e) {
				System.out.println( "c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요");
				return;
			}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
	}
}

