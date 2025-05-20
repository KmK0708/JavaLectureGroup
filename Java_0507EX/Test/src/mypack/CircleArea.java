package mypack;
// 예제 2-2
public class CircleArea {
	public static void main(String[] args)
	{
		final double PI = 3.14; // 원주율 상수로 선언
		
		double radius = 10.0; // 원의 반지름
		double circleArea = radius*radius*PI; // 원 면적 계산
		
		// 원의 면적을 화면 출력하기
		System.out.println("원의 면적 = " + circleArea);
		
	}

}
