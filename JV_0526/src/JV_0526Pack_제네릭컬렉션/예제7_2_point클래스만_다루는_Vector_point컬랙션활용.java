package JV_0526Pack_제네릭컬렉션;

import java.util.Vector;

class Point1 {
	private int x,y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")" ;
	}
}

public class 예제7_2_point클래스만_다루는_Vector_point컬랙션활용 {
	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 벡터 생성
		Vector<Point1> v = new Vector<Point1>();
		
		// 3개의 Point 객체 삽입
		v.add(new Point1(2,3));
		v.add(new Point1(-5,20));
		v.add(new Point1(30,-8));
		
		v.remove(1);// 인덱스 1의Point1(-5,20) 객체 삭제
		
		// 벡터에있는 포인트1 객체 모두 검색해서 출력
		for(int i = 0;i<v.size();i++) {
			Point1 p = v.get(i);// 벡터에서 i번째 객체 얻어내기
			System.out.println(p);// p.toString() 을 이용해서 객체 p 출력
		}
		
	}
}
