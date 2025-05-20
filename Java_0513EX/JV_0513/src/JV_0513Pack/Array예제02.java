package JV_0513Pack;

import java.util.Scanner;
// 3-8 배열 원소의 평균 구하기, 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 구하는 프로그램작성
public class Array예제02 {
	public static void main(String[] args) {
		int intArray[] = new int [5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요 >> ");
		for(int i = 0; i<intArray.length;i++)
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
		
		for(int i = 0;i<intArray.length;i++)
			sum += intArray[i];// 배열에 저장된 정수 값 더하기
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}
}
