package JV_0513Pack;

import java.util.Arrays;

public class Array_배열리턴 {
	static int[] makeArray() { // 정수형 배열 리턴하는 함수(메소드)
		int temp[] = new int[4];// 배열 생성
		for (int i = 0; i<temp.length;i++) // i를 배열 temp의 길이만큼 반복 0 1 2 3
			temp[i]= i; // 배열의 원소 0,1,2,3 으로 초기화
		return temp; // 배열 반환
	}
	
	
	public static void main(String[] args) {
		int intArray[];// 배열 레퍼런스 변수 선언
		intArray = makeArray(); // 메소드(함수)로 부터 배열 받기
		
		System.out.print(Arrays.toString(intArray));
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i] + " "); // 배열 모든 원소 출력하기
	}
}
