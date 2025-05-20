package JV_0513Pack;

public class Do_While문예제01 
{
	public static void main (String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char) (c + 1);
		} while (c <= 'z'); 	
	}

}
