package JV_0513Pack;

import java.util.Scanner;
// 문제 1 원화를 입력하면 달러로 환전하기, 1달러 = 1200원 고정
public class Ex01_Exchange 
{
	public static void main(String[] args)
	{
		final double rate = 1200.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요 : ");
		int won = scanner.nextInt();
		
		double Bucks = won / rate;
		System.out.printf("%d원은 $%.2f입니다.", won, Bucks);
		
		scanner.close();
		
	}
}
