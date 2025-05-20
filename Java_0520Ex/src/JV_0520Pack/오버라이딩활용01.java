package JV_0520Pack;
//예제 5-5.1 : 예제 5-5의 Shape, Line, Rect, Circle 클래스 활용
public class 오버라이딩활용01 {
	public static void main(String[] args) {
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // Line 객체연결
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		// 모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
}
