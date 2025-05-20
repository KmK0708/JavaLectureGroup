package JV_0513Pack;

import java.util.Scanner;
// 3-6 break문 이용해서 while문 벗어나기
// exit이 입력되면 while문 벗어나도록 하기
public class Break문_예제 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit")) // exit 입력되면 반복 종료
				break;
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
	}
}
