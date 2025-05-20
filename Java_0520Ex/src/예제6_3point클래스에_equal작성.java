
//예제 6-3 : Point 클래스에 equals() 작성
//Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라.
class Points {
	private int x, y;
	public Points(int x, int y) {
		this.x = x; this.y = y;
	}
	public boolean equals(Object obj) {
		Points p = (Points)obj; 
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}

public class 예제6_3point클래스에_equal작성 {
	public static void main(String[] args) {
		Points a = new Points(2,3);
		Points b = new Points(2,3);
		Points c = new Points(3,4);
	
		if(a == b) // false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}

}
