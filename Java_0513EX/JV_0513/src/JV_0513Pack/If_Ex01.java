package JV_0513Pack;

import java.util.Scanner;
// 예제 2-10 if문 사용하기
public class If_Ex01 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("축하합니다. 합격입니다.");
		
		scanner.close();
	}
}
