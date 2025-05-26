package JV_0526Pack_제네릭컬렉션;

// 스택을 제네릭 클래스로 작성하고, String과 Integer형 스택을 사용하는 예를 보여라.

class GStack<T>{
	int tos;
	Object [] stk;
	public GStack() {
		tos = 0;
		stk = new Object [10];
	}
	public void push(T item) {
		if(tos == 10)
			return;
		stk[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stk[tos];
	}
}

public class 예제7_9_제네릭스택_만들기 {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>(); 
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
	
		for(int n=0; n<3; n++)		
			System.out.println(intStack.pop());
	}

}
