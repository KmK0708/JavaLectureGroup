package JV_0519Pack;

//예제 4-12 : static을 이용한 환율 계산기
//static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기를 만들어보자.
import java.util.Scanner;

class CurrencyConverter{
	private static double rate; // 한국 원화에 대한 환율
	public static double toDollar(double won) {
		return won/rate; // 한국 원화 달러 변환하기
	}
	public static double toKWR(double dollar) {
		return dollar * rate; // 달러 원화로 변환
	}
	public static void setRate(double r) {
		rate = r; // 환율 설정, KWR / $1
	}
}

public class Static예제02_환율계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate); // 미국달러 환율 설정
		System.out.println("백만원은 $ " + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		sc.close();
	}
}
