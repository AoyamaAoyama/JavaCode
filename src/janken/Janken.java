package janken;

import java.util.Random;
import java.util.Scanner;

public class Janken{
	
	public static final int GUU = 0;
	public static final int CHOKI = 1;
	public static final int PAA = 2;
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//入力情報
		Scanner scan = new Scanner(System.in);
		
		String strhand = null;
		int hand = -1;
		
		for(int i = 0; i < 5; i++) {
			int hand2 = r.nextInt(3);
			
			//自分の手
			hand = scan.nextInt();

			//あいこパターン
			if(hand2 - hand == 0) {
				System.out.println("あいこ");
			}
			//勝ちパターン
			else if(hand2 - hand == 1 || hand2 - hand == -2) {
				System.out.println("勝ち");
			}
			//負けパターン
			else {
				System.out.println("負け");
			}
		}
	}
}