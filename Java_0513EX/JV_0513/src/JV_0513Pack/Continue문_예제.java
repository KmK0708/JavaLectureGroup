package JV_0513Pack;

import java.util.Scanner;
// 3-5 continue 문을 이용한 양수 합 구하기 . 5개 정수 입력 받고  그 중 양수만 합해서 출력하기
public class Continue문_예제 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); // 키보드에서 정수 입력
			if(n<=0) 
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			else 
				sum += n; // 양수인 경우 덧셈
		}
		System.out.println("양수의 합은 " + sum);
		
		scanner.close();

	}
}
