package JV_0526Pack_제네릭컬렉션;

import java.util.*;

public class 예제7_3_문자열입력받아_ArrayList저장 {
	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름 받아 삽입
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String s = sc.next(); // 키보드로 입력하기
			a.add(s); // arraylist 컬랙션에 삽입
		}
		// arraylist에 들어있는 모든 이름 출력
		for(int i = 0;i<a.size();i++) {
			// arraylist의 i번째 문자열 얻기
			String name = a.get(i);
			System.out.print(name+" ");
		}
		//가장 긴 이름 출력하기
		int longname = 0;
		for(int i = 0; i<a.size();i++) {
			if(a.get(longname).length() < a.get(i).length())
				longname = i;
		}
		System.out.println("\n가장 긴 이름은 : "  + a.get(longname));
		
		sc.close();
	}
	
}
