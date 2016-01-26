/*
 * 掛け算九九表の作成
 *作成者：前川沙織  作成日：2016/jan
 */
public class KisoKadai1 {

		public static void main(String[] args) {
			System.out.println("xに1-9の中で数字を入力してください");
			int x = new java.util.Scanner(System.in).nextInt();
			System.out.println("yに1-9の中で数字を入力してください");
			int y = new java.util.Scanner(System.in).nextInt();

			kuku(x, y);
	}

		public static void kuku(int x, int y){

			for (int i = 1; i <= x; i++){
			  for (int j = 1; j <= y; j++){
				  System.out.print((i*j)>=10 ? " "+(i*j) : "  "+(i*j));

			}
			  System.out.println();
			}
		}



}