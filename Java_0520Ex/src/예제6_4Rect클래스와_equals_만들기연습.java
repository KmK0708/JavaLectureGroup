//int 타입의 width(너비)와 height(높이) 필드를 가지는 Rect 클래스를 작성하고, 면적이 같으면
//두 Rect 객체가 같은 것으로 판별하는 equals()를 작성하라. 생성자에서 너비와 높이를 받아 width, height 필드를 초기화하라.

class Rectz{
	private int width;
	private int height;
	public Rectz(int width,int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rectz p = (Rectz)obj;
		if (width*height == p.width*p.height) 
			return true;
		else 
			return false;
	}
}

public class 예제6_4Rect클래스와_equals_만들기연습 {
	public static void main(String[] args) {
		Rectz a = new Rectz(2,3);
		Rectz b = new Rectz(3,2);
		Rectz c = new Rectz(3,4);
		if(a.equals(b)) 	
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
		 	System.out.println("b is equal to c");
	}

}
