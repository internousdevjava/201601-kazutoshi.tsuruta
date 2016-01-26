/**
 *
 */

/**
 * @author internous
 *
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class KisoKadai3 {
	public static void folder(){
		String f1,f2;
		f1=new java.util.Scanner(System.in) .nextLine();
		File file = new File(f1);
		if(file.exists()){
			f2=new java.util.Scanner(System.in) .nextLine();
			File nFile=new File(f1+"\\"+f2);
			nFile.mkdir();

		}else{
			System.out.println("ファイルがないためメニューに戻ります");
			return;
		}

	}
	/**
	 * @param args
	 */
	public static void file(){
		String f1,f2;
		System.out.println("保存する場所を絶対パスで入力してください。");
		f1=new java.util.Scanner(System.in) .nextLine();
		File file = new File(f1);
		if(file.exists()){
			System.out.println("新しいファイル名を入力してください。");
			f2=new java.util.Scanner(System.in) .nextLine();
			File nFile=new File(f1+"\\"+f2);
			try {

				nFile.createNewFile();
				System.out.println("ファイル作成成功しました。");

			} catch(IOException e) {
				e.printStackTrace();
				System.out.println("ファイル作成に失敗しました。");
			}
		}else{
			System.out.println("ファイルがないためメニューに戻ります");
			return;
		}

	}
	public static void tsuiki(){
		String f1,f2,tsuiki;
		System.out.println("保存する場所を絶対パスで入力してください。");
		f1=new java.util.Scanner(System.in) .nextLine();
		File file1 = new File(f1);
		if(file1.exists()){
			System.out.println("ファイル名を入力してください。");
			f2=new java.util.Scanner(System.in) .nextLine();
			File file2 = new File(f1+"\\"+f2);
			if(file2.exists()){
				System.out.println("追記する内容を入力してください。");
				tsuiki=new java.util.Scanner(System.in) .nextLine();
				FileWriter FW=null;
				try {

					FW=new FileWriter(f1+"\\"+f2,true);
					FW.write(tsuiki+"\r\n");
					FW.flush();
					System.out.println("ファイルに追記しました。");

				} catch(IOException e) {

					System.out.println("ファイル作成に失敗しました。");
				}finally{
					if(FW!=null){
						try{
							if(FW!=null){
								FW.close();
							}
						}catch(IOException e2){

						}

					}
				}

			}else{
				System.out.println("ファイルがないためメニューに戻ります");
				return;
			}

		}else{
			System.out.println("フォルダーがないためメニューに戻ります");
			return;
		}

	}
	public static void syuturyoku(){
		String f1,f2;
		System.out.println("保存する場所を絶対パスで入力してください。");
		f1=new java.util.Scanner(System.in) .nextLine();
		File file1 = new File(f1);
		if(file1.exists()){
			System.out.println("ファイル名を入力してください。");
			f2=new java.util.Scanner(System.in) .nextLine();
			File file2 = new File(f1+"\\"+f2);
			if(file2.exists()){
				System.out.println("追記する内容を入力してください。");

				FileReader FW=null;
				try {

					FW= new FileReader(f1+"\\"+f2);
					System.out.println("ファイルに出力します。");
					int a;
					while((a=FW.read()) !=-1){
						System.out.println((char)a);
					}

				} catch(IOException e) {

					System.out.println("ファイル作成に失敗しました。");
				}finally{
					if(FW!=null){
						try{
							if(FW!=null){
								FW.close();
							}
						}catch(IOException e2){

						}

					}
				}

			}else{
				System.out.println("ファイルがないためメニューに戻ります");
				return;
			}

		}else{
			System.out.println("フォルダーがないためメニューに戻ります");
			return;
		}

	}
	public static void uwagaki(){
		String f1,f2,uwagaki;
		System.out.println("保存する場所を絶対パスで入力してください。");
		f1=new java.util.Scanner(System.in) .nextLine();
		File file1 = new File(f1);
		if(file1.exists()){
			System.out.println("ファイル名を入力してください。");
			f2=new java.util.Scanner(System.in) .nextLine();
			File file2 = new File(f1+"\\"+f2);
			if(file2.exists()){
				System.out.println("上書きする内容を入力してください。");
				uwagaki=new java.util.Scanner(System.in) .nextLine();
				FileWriter FW=null;
				try {

					FW=new FileWriter(f1+"\\"+f2,false);
					FW.write(uwagaki+"\r\n");
					FW.flush();
					System.out.println("ファイルに上書きしました。");

				} catch(IOException e) {

					System.out.println("ファイル作成に失敗しました。");
				}finally{
					if(FW!=null){
						try{
							if(FW!=null){
								FW.close();
							}
						}catch(IOException e2){

						}

					}
				}

			}else{
				System.out.println("ファイルがないためメニューに戻ります");
				return;
			}

		}else{
			System.out.println("フォルダーがないためメニューに戻ります");
			return;
		}

	}
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int end = 0;
		while(end==0){

			System.out.println("\n\n--メニュー--\n\n1:ファイルの作成\n2:フォルダーの作成\n3:追記\n4:上書き\n5:出力\n99:終了\nを入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int nu = 0;

			if(str.matches("^[0-9]+$")){
				nu=Integer.parseInt(str);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			}

			if(nu==99){
				System.out.println("終了");
				break;
			}
			if(nu==1){
				System.out.println("ファイルの作成");
				file();
			}
			if(nu==2){
				System.out.println("フォルダーの作成");
				folder();


			}
			if(nu==3){
				System.out.println("追記");
				tsuiki();
			}
			if(nu==4){
				System.out.println("上書き");
				uwagaki();
			}
			if(nu==5){
				System.out.println("出力");
				syuturyoku();
			}
		}
		System.out.println("--処理終了--");

	}


}
