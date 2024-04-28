import java.util.Random;
import java.util.Scanner;

public class Main{
	public static void main (String[]args) {
		int[]num;
		num = new int[5];
		
	Scanner stdIn = new Scanner(System.in);
	
	//寂しかったのでオープニング挿入
	System.out.println("数字当てゲーーーーーーーム!");
		System.out.println("指示に従い、1-99までの数字を５回入力していただきます\n1-99の中でピッタリの数字を当てれたらゲーム終了です！");
		System.out.println("1回目の数字を入力してください");
		num[0] = stdIn.nextInt();
		
		System.out.println("2回目の数字を入力してください");
		num[1] = stdIn.nextInt();
		
		System.out.println("3回目の数字を入力してください");
		num[2] = stdIn.nextInt();
		
		System.out.println("4回目の数字を入力してください");
		num[3] = stdIn.nextInt();
		
		System.out.println("5回目の数字を入力してください");
		num[4] = stdIn.nextInt();
		
		System.out.println("乱数を生成します");
		Random rand =new Random();
		int rand_num = rand.nextInt(99)+1;
		
		//デバック用
		System.out.println("デバック用で生成された数値を表示します（" + rand_num + ")");
		while(num[0] != rand_num && num[1] != rand_num && num[2] != rand_num && num[3] != rand_num && num[4] != rand_num ) {
			
			System.out.println("指定されたに一致しませんでした :(\n一致しなかったのでもう一度試してみましょう！");
			
			System.out.println("1回目の数字を入力してください");
			num[0] = stdIn.nextInt();
			
			System.out.println("2回目の数字を入力してください");
			num[1] = stdIn.nextInt();
			
			System.out.println("3回目の数字を入力してください");
			num[2] = stdIn.nextInt();
			
			System.out.println("4回目の数字を入力してください");
			num[3] = stdIn.nextInt();
			
			System.out.println("5回目の数字を入力してください");
			num[4] = stdIn.nextInt();
			
		}
		System.out.println("指定された数字に一致しました :)");
	}
}
