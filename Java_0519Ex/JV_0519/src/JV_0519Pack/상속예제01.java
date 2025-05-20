package JV_0519Pack;

class Point {
	private int x,y; // 한 점을 구성하는 xy좌표
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point{
	private String color; // 점의 색
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {  // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();  // Point 클래스의 showPoint() 호출
	}
}

public class 상속예제01 {
	public static void main(String[] args) {
		Point p = new Point(); // point객체 생성
		p.set(1, 2);//point 클래스의 set()호출
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // 컬러포인트 객체
		cp.set(3, 4); // point의 set함수 호출
		cp.setColor("red"); // ColorPoint의 setColor() 호출
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}
