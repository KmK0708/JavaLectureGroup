package JV_0519Pack;

//예제 4-6 : Circle 객체 배열 만들기

//반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력하라.
class Circle객체 {
	int radius;
	
	public Circle객체(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class Circle_객체배열01 {
	public static void main(String[] args) {
		Circle객체 [] c;
		c = new Circle객체[5]; // Circle 객체 배열 선언 및 생성
		
		for (int i = 0; i<c.length;i++)
			c[i] = new Circle객체(i); // 반지름 0~4인 Circle 객체 생성
		
		for (int i = 0; i<c.length;i++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}
