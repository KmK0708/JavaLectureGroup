package JV_0519Pack;

// 예제 4-5 this()로 다른 생성자 호출
public class Book_This사용예제01 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author);}
	
	public Book_This사용예제01() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Book_This사용예제01(String title) {
		this(title, "작자미상");
	}
	public Book_This사용예제01(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String [] args) {
		Book_This사용예제01 littlePrince = new Book_This사용예제01("어린왕자", "생텍쥐페리");
		Book_This사용예제01 loveStory = new Book_This사용예제01("춘향전");
		Book_This사용예제01 emptyBook = new Book_This사용예제01();		
		loveStory.show();
		emptyBook.show(); // 아무것도없어서 안뜸
		littlePrince.show();
	}

}
