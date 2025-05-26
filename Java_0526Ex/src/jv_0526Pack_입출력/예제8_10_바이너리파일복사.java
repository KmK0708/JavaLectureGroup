package jv_0526Pack_입출력;

import java.io.*;

//바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라

public class 예제8_10_바이너리파일복사 {
	public static void main(String[] args) {
		File src = new File("c:\\Web\\Wallpaper\\Spotlight\\img1.jpeg");
		File dest = new File("c:\\Temp\\copyimg.jpeg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "를 " + 
					dest.getPath()+ "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
