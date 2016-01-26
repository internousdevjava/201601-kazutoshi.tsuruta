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


	public static void main(String[] args){
		System.out.println("スタート");
		System.out.println("数字を入力してください \n ターン数が100になるまでに当ててください");

		int a = 0;
		int ans = new java.util.Random() .nextInt(100);
			for(int i = 1; i <= 100; i++){

			    try {
			    	String x = new java.util.Scanner(System.in) .nextLine();
					long input;
				    input = Integer.parseInt(x);
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
					}else {

					}
				} catch (NumberFormatException e) {

				    System.out.println("ちゃんと数字を入れてください!");
				}

				a++;
				System.out.println("現在のターン数 : " + a);
			}
	}
}
