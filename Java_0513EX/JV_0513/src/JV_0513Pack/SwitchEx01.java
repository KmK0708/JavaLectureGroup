package JV_0513Pack;

import java.util.Scanner;
// 2-14 Switch문으로 학점 매기기
public class SwitchEx01 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		switch (score/10)
		{
		case 10:// score = 100
		case 9: // score =90 ~ 99
			grade = 'A';
			break;
		case 8: // score = 80 ~ 89
			grade = 'B';
			break;
		case 7: // score = 70 ~ 79
			grade = 'C';
			break;
		case 6: // score = 60 ~ 69
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.print("학점은 " + grade + " 입니다.");
		scanner.close();
	}
}
