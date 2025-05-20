package JV_0513Pack;

import java.util.Scanner;
//문제3
//Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력 받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
//(삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 켜야 한다.
public class Ex03_Triangle_NeedInt 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("정수 3개를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();	
		
		if ((a+b > c) && (b+c > a) && (a + c > b))
			System.out.print("삼각형이 됩니다.");
		else
			System.out.print("삼각형이 안됩니다.");
		
		scanner.close();
	}
}
