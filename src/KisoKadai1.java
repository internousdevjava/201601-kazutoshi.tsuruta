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
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x=new java.util.Scanner(System.in) .nextInt();
		int y=new java.util.Scanner(System.in) .nextInt();
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
