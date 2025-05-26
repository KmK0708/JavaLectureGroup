package JV_0526Pack_제네릭컬렉션;

import java.util.*;
//해시맵을 이용하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 작성하라

public class 예제7_6_HashMap_이용하여_자바과목의_이름과점수관리 {
	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> scoreMap = 
				new HashMap<String, Integer>();
		
		// 5 개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);

		System.out.println("HashMap의 요소 개수 :" 
				+ scoreMap.size());
		
		// 모든 사람의 점수 출력. 
		// javaScore에 들어 있는 모든 (key, value) 쌍 출력
		 // key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = scoreMap.keySet();

		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator(); 
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}

