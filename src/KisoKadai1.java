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
		int end=0;
		while(end==0){
			System.out.println("1～9の数字xを入力してください。");
			System.out.print("X=");
			//int x=new java.util.Scanner(System.in) .nextInt();
			//int y=new java.util.Scanner(System.in) .nextInt();
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String str1 = br1.readLine();
			int x = 0;
			if(str1.matches("^[1-9]+$")){
				x=Integer.parseInt(str1);
			}else{
				System.out.println("\n----------\n半角数値で1～9の数字を入力してください。\n----------\n");
				System.out.println("\n----------\n最初に戻ります。\n----------\n");
				continue;

			}

			System.out.println("1～9の数字yを入力してください。");
			System.out.print("y=");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			String str2 = br2.readLine();
			int y = 0;
			if(str2.matches("^[1-9]+$")){
				y=Integer.parseInt(str2);
			}else{

				System.out.println("\n----------\n半角数値で1～9の数字を入力してください。\n----------\n");
				System.out.println("\n----------\n最初に戻ります。\n----------\n");
				continue;

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
			System.out.println("終了するには1、続けるには2を押してください。");
			BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
			String str3 = br3.readLine();
			int s = 0;
			if(str3.matches("^[0-9]+$")){
				s=Integer.parseInt(str3);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
				System.out.println("\n----------\n\n----------\n");

			}
			if(s==1){
				System.out.println("終了します。");
				break;
			}else if(s==2){
				System.out.println("最初に戻ります。");
				continue;
			}

		}

	}
}
