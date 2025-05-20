package JV_0519Pack;

//예제 4-7 : 객체 배열 만들기 연습
//예제 4-4의 Book 클래스를 활용하여2개짜리 Book 객체 배열을 만들고,
//사용자로부터 책의 제목과 저자를입력 받아 배열을 완성하라.
import java.util.Scanner;

class Bookobj {
	String title, author;
	public Bookobj(String title, String author) { 
		this.title = title;
		this.author = author;
	}
}

public class Obj_array {
	public static void main(String[] args) {
		Bookobj [] book = new Bookobj[2]; // Book 배열 선언

		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Bookobj(title, author); // 배열 원소 객체 생성
		}

		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");

		scanner.close();
	}

}
