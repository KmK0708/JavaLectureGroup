package mypack;

import java.util.Scanner;

// 스캐너 예제 2-4
public class ScannerEx {
	public static void main(String args [])
	{
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기 (공백 전까지) 
		System.out.print("이름은 "+name+ " , ");
		
		String city = scanner.next(); // 문자열 읽기
		System.out.print("도시는 "+city+" , ");
		
		int age = scanner.nextInt(); // 나이(정수) 읽기
		System.out.print("나이는 "+age+" 살, ");
		
		double weight = scanner.nextDouble(); // 몸무게(실수)읽기
		System.out.print("몸무게는 "+weight+" kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신 여부는 "+ single +" 입니다.");
		
		scanner.close(); // scanner 닫기
	}
	
}
