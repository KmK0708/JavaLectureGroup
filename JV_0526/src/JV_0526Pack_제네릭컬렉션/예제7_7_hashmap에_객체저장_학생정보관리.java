package JV_0526Pack_제네릭컬렉션;
//id와 전화번호로 구성되는 Student 클래스를 만들고, 이름을 ‘키’로 하고 Student 객체를 ‘값’으로 하는 해시맵을 작성하라. 
import java.util.*;

class Student { // 학생 클래스
	int id;
	String tel;
	public Student(int id,String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class 예제7_7_hashmap에_객체저장_학생정보관리 {
	public static void main(String[] args) {
		// 학생이름과 student 객체를 쌍으로 저장하는 hashmap 컬랙션
		HashMap<String, Student> map = new HashMap<String,Student>();
		
		// 3명학생 저장
		map.put("김주영", new Student(1,"010-1234-5678"));
		map.put("김성준", new Student(2,"010-1324-6752"));
		map.put("하예림", new Student(3,"010-3123-8628"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름 : ");
			String name = sc.nextLine();
			if(name.equals("exit"))
				break;
			
			Student student = map.get(name);
			if(student == null) {
				System.out.println(name + "은(는) 없는 학생입니다.");
			}
			else
				System.out.println("id : " + student.id + "전화 : " + "student.tel");
		}
		sc.close();
	}

}
