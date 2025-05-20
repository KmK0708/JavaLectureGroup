package JV_0519Pack;

class Sample{
	public int a;
	private int b;
	int c;
}

public class 접근지정자예제 {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; // private 선언으로 이 클래스에선 접근 불가
		aClass.c = 10;
	}

}
