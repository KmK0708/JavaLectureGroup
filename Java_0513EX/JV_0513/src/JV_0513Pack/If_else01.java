package JV_0513Pack;

import java.util.Scanner;
// 예제 2-11 if-else 사용하기
public class If_else01 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int number = in.nextInt();

		if (number % 3 == 0)
			System.out.println("3의 배수입니다.");
		else 
			System.out.println("3의 배수가 아닙니다.");

		in.close();

	}
}
