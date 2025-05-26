package JV_0526Pack_제네릭컬렉션;

//영어, 한글) 단어를 쌍으로 해시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하라. "exit"이 입력되면 프로그램을 종료한다.
import java.util.*;

public class 예제7_5_Hashmap을이용하여_단어쌍의저장검색 {
	public static void main(String[] args) {
		// 영단어와 한글 단어의 쌍을 저장하는 hashmap 컬랙션 생성
		HashMap<String, String> dic = new HashMap<String,String>();
		
		// 3개의 키 값 쌍을 dic에 저장하기
		dic.put("Baby", "아기");
		dic.put("Love", "사랑");
		dic.put("Apple", "사과");
		
		// 영어 단어를 입역받고 한글 단어 검색, "exit" 입력받으면 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
		}
			// 해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
		sc.close();

	}

}
