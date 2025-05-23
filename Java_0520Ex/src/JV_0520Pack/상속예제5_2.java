package JV_0520Pack;

//예제 5-2: 상속 관계에 있는 클래스 간 멤버 접근
/*클래스 Person을 아래와 같은 멤버 필드를 갖도록 선언하고 클래스 Student는 클래스 Person을 상속받아 각 멤버 필드에 값을 저장하시오. 
이 예제에서 Person 클래스의 private 필드인 weight는 Student 클래스에서는 접근이 불가능하여 
슈퍼 클래스인 Person의 getXXX, setXXX 메소드를 통해서만 조작이 가능하다.*/

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 26; // 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "김주영"; // 슈퍼 클래스의 public 멤버 접근 가능
		height = 174; // 슈퍼 클래스의 protected 멤버 접근 가능
		// weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
		setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근

	}
}

public class 상속예제5_2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
