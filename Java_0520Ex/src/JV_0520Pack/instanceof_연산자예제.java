package JV_0520Pack;

//예제 5-4 : instanceof 연산자 활용
//instanceof 연산자를 이용하여 상속 관계에 따라 레퍼런스가 가리키는 객체의 타입을 알아본다. 
//실행결과는 무엇인가?

class Persons {}
class Students extends Persons {}
class Researcher extends Persons {}
class Professor extends Researcher {}

public class instanceof_연산자예제 {
	static void print(Persons p) {
		if(p instanceof Persons)
			System.out.print("Person ");
		if(p instanceof Students)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); print(new Students());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
	}

}
