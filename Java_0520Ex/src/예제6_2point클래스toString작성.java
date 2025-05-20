//예제 6-2 : Point 클래스에 toString() 작성

//class point는 예제 6-1 에 작성함


public class 예제6_2point클래스toString작성 {
	public static void main(String [] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
	}
}
