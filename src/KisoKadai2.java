import java.io.IOException;

/**
 *
 */

/**
 * @author internous
 *
 */

public class KisoKadai2 {

	/**
	 * @param args
	 * @throws IOException
	 */


	public static void main(String[] args) throws IOException{
		System.out.println("スタート");
		System.out.println("数字を入力してください \n ");

		int ans = new java.util.Random() .nextInt(100);
			for(int i = 1; i <= 100; i++){


				int input =new java.util.Scanner(System.in) .nextInt();
;


				if(ans == input){
					System.out.println("True!");
					break;
				}else if(ans != input){
					System.out.println("False...");
				}

				if(input > ans){
					System.out.println("ヒント：答えは入力した数より小さいです");
				}else if(input < ans){
					System.out.println("ヒント：答えは入力した数より大きいです");
				}


			}
	}
}
