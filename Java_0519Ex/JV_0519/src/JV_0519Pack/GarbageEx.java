package JV_0519Pack;
 
// 예제 4-9 가비지의 발생
public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e; // 가비지 발생
		a = null; 
		d = c;
		c = null;
	}

}
