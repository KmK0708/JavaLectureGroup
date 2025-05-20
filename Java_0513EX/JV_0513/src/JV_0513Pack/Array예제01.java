package JV_0513Pack;

import java.util.Scanner;
// 3-7 배열에 입력받은 수 중 제일 큰 수 찾기, 양수 5개를 입력받아 배열에 저장하고 제일 큰 수를 출력하라
public class Array예제01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray [] = new int[5]; // 배열 선언 과 생성 0,1,2,3,4
		
		int max = 0; // 현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요 : ");
		for(int i = 0;i < 5;i++) {
			intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
			if(intArray[i] > max) // intArray가 현재 가장 큰 수보다 크면
				max = intArray[i];// intArray를 max로 변경함
		}
		System.out.print("가장 큰 수는" + max + " 입니다.");
		scanner.close();
	}
}
