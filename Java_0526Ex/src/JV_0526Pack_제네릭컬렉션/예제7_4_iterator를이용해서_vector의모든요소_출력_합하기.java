package JV_0526Pack_제네릭컬렉션;

import java.util.*;

public class 예제7_4_iterator를이용해서_vector의모든요소_출력_합하기 {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		// iterator를 이용한 모든 정수 출력
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		// iterator를 이용하여 모든 정수 더하기
		int sum = 0 ;
		it = v.iterator(); // iterator 객체 얻기
		
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수의 합 : " + sum);
		
	}
}
