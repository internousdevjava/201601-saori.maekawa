/*
 * テキストファイルの読み書きプログラム
 * 作成者：前川沙織  作成日：2016年1月
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KisoKadai3 {


	public static void main(String[] args)throws IOException {
		while(true){
			System.out.println("何をしますか？\n");
			System.out.println("--メニュー--\n1:フォルダ作成 2:ファイルの読み込み 3:ファイルの書き込み 4:終了");
			@SuppressWarnings("resource")
			int i = new java.util.Scanner(System.in).nextInt();


				if (i == 1){
					System.out.println("フォルダを作成します");
					System.out.println("フォルダの名前を入力してください");
					@SuppressWarnings("resource")
					String input = new java.util.Scanner(System.in).nextLine();

					File newfile = new File("c:\\" + input);

					if (newfile.mkdirs()){
						System.out.println("フォルダをの作成に成功しました");
					} else {
						System.out.println("フォルダをの作成に失敗しました\n既に存在します");
					}

				}


				if (i == 2){
					System.out.println("ファイル名を絶対パスで入力してください");
					@SuppressWarnings("resource")
					String input2 = new java.util.Scanner(System.in).nextLine();
					try{
						  File file2 = new File(input2);
						  FileReader filereader = new FileReader(file2);

						  int ch;
						  while((ch = filereader.read()) != -1){
						    System.out.print((char)ch);
						  }

						  filereader.close();
						}catch(FileNotFoundException e){
						  System.out.println(e);
						}catch(IOException e){
						  System.out.println(e);
						}
				}

				if (i == 3){
					System.out.println("ファイル名を絶対パスで入力してください");
					String input3 = new java.util.Scanner(System.in).nextLine();

					 File file3 = new File( input3 );
					if (file3.exists()){
						try{
							 System.out.println("入力してください");
					    	    @SuppressWarnings("resource")
								String overwrite = new java.util.Scanner(System.in).nextLine();
					    	    FileWriter filewriter = new FileWriter(file3);

					    	    filewriter.write( overwrite );
					    	    System.out.println( overwrite + "と、上書きしました");

					    	    filewriter.close();


						    }catch(IOException e){
						      System.out.println("ファイルに書き込めません");
						      System.out.println(e);
						    }

			      }else{
					   System.out.println("認識できません");
					   return ;
				    	}




				}

				if (i == 4){

					break;

				}
		}





	}

}
