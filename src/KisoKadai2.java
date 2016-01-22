/*
 * 数当てゲーム
 * 作成者：前川沙織  作成日：2016年1月
 */
public class KisoKadai2 {

	public static void main(String[] args) {

		int ans = new java.util.Random().nextInt(100);
		ans++;
		System.out.println("１０回までのゲームです");
		for(int i = 0; i < 10; i++){
			System.out.println("数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
				if(ans == num){
				System.out.println("アタリ!!!\n");
				break;
				} else {
					if (ans < num ){
						System.out.println("LOW\n");
					} else {System.out.println("HIGH\n");}

				}
		}

	System.out.println("E N D");

	}

}
