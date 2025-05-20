package JV_0513Pack;

// 3-4 2중 중첩이용한 구구단
public class for문예제_중첩 {
	public static void main(String[] args)
	{
		for(int i = 1; i<10;i++) { // 1단 부터 9단
			for(int j=1;j<10;j++) { // 각 단 구구단 출력
				System.out.print(i + " x " + j + " = " + i*j);
				System.out.print("\t\t"); // 하나씩 탭으로 떼놓기
			}
			System.out.println(); // 한 단 끝나면 다음줄로 이동
		}
	}
}
