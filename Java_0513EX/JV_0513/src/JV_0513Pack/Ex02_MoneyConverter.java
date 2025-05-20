package JV_0513Pack;

import java.util.Scanner;
// 문제 2 정수로된 돈을 입력받아 지폐와 동전으로 분류하기 (5만원,1만원,천원,500원,100원,50원,10원,1원)
public class Ex02_MoneyConverter 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		int Money = scanner.nextInt();
		
		int 오만원 = Money / 50000;
		Money = Money % 50000;
		
		int 만원 = Money / 10000;
		Money = Money % 10000;
		
		int 천원 = Money / 1000;
		Money = Money % 1000;
		
        int 오백원 = Money / 500;
        Money = Money % 500;

        int 백원 = Money / 100;
        Money = Money % 100;

        int 오십원 = Money / 50;
        Money = Money % 50;

        int 십원 = Money / 10;
        Money = Money % 10;

        int 일원 = Money;
        
        System.out.println("오만원 : " + 오만원 + " 장 ");
        System.out.println("만원 : " + 만원 +" 장 ");
        System.out.println("천원 : " + 천원 +" 장 ");
        System.out.println("500원 : " + 오백원 + " 개 ");
        System.out.println("100원 : " + 백원 + " 개 ");
        System.out.println("50원 : " + 오십원 + " 개 ");
        System.out.println("10원 : " + 십원 + " 개 ");
        System.out.println("1원 : " + 일원 + " 개 ");
        
        scanner.close();
	}
}
