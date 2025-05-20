package JV_0519Pack;


//예제 4-3 : 두 개의 생성자를 가진 Circle 클래스
//다음 코드는 2개의 생성자를 가진 Circle 클래스이다. 실행 결과는 무엇인가?
public class Circle_02 {
	int radius;
	String name;

	public Circle_02() { // 매개 변수 없는 생성자
		radius = 1; name = ""; // radius의 초기값은 1
	}
	public Circle_02(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_02 pizza = new Circle_02(10, "자바피자"); // Circle 객체 생성, 반지름 10

		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle_02 donut = new Circle_02(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
