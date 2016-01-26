import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 * @throws q
	 */
	public static void main(String[] args) throws IOException  {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数字を入力してください。");
		//int x=new java.util.Scanner(System.in) .nextInt();
		//int y=new java.util.Scanner(System.in) .nextInt();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		int x = 0;
		if(str1.matches("^[0-9]+$")){
			x=Integer.parseInt(str1);
		}else{
			System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			System.out.println("\n----------\n終了します。\n----------\n");
			return;
		}


		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		int y = 0;
		if(str2.matches("^[0-9]+$")){
			y=Integer.parseInt(str2);
		}else{
			System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			System.out.println("\n----------\n終了します。\n----------\n");
			return;
		}


		for(int j = 1; j <= x; j ++) {
			for(int i = 1; i <= y; i ++) {
				int value = i * j;
				System.out.print(j + "*" + i + " = ");
				if(value < 10) {
					System.out.print(" ");
				}
			System.out.print(value + "  ");
			}
		System.out.println();
		}

	}
}
