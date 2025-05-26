package JV_0526Pack_제네릭컬렉션;

import java.util.Vector;

public class 예제7_1_정수만다루는_Vector컬렉션활용 {
	public static void main(String[] args) {
		// 정수값만 다루는 제네릭 벡터
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//벡터 중간 삽입
		v.add(2,100);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		//모든 요소 정수 출력
		for(int i = 0; i<v.size(); i++)
		{
			int n = v.get(i);
			System.out.println(n);
		}
		// 벡터 속 모든 정수 더하기
		int sum = 0;
		for (int i= 0;i<v.size();i++) {
			int n=v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);
	}
}
