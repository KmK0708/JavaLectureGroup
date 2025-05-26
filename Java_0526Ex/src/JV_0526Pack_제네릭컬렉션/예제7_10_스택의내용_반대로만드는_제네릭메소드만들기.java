package JV_0526Pack_제네릭컬렉션;


//예제 7-9의 GStack을 이용하여 주어진 스택의 내용을 반대로 만드는 제네릭 메소드 reverse()를 작성하라.

public class 예제7_10_스택의내용_반대로만드는_제네릭메소드만들기 {
	// T가 타입 매개 변수인 제네릭 메소드
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while(true) {
			T tmp;
			tmp = a.pop();// 스택에서 요소 꺼내기
			if(tmp == null )//스택이 비었다면
				break; // 멈추기
			else
				s.push(tmp);// 새 스택에 요소넣기
		}
		return s; // 새 스텍 반환
	}
	public static void main(String[] args) {
		// Double 타입의 GStack 생성
		GStack<Double> gs = 
				new GStack<Double>(); 

		// 5개의 요소를 스택에 push
		for (int i=0; i<5; i++) { 
			gs.push(new Double(i)); 
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}

}
