import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 掛け算九九表の作成
 *作成者：前川沙織  作成日：2016/jan
 */
public class KisoKadai1 {

		public static void main(String[] args) {

			while(true){
				int x;
				int y;
				int flag=0;
				System.out.println("xに1-9の中で数字を入力してください");
				InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                try{
                        String buf = br.readLine();
                        x = Integer.parseInt(buf);
                }catch(Exception e){
                	flag=1;
                	x=10;

                        System.out.println("数字を入力してください");
                }
				System.out.println("yに1-9の中で数字を入力してください");
				InputStreamReader isr1 = new InputStreamReader(System.in);
                BufferedReader br1 = new BufferedReader(isr1);
                try{
                        String buf = br1.readLine();
                        y = Integer.parseInt(buf);
                }catch(Exception e){

                	flag=1;
                	y=10;
                        System.out.println("数字を入力してください");
                }

				if(x >= 10 || y >=10){
					System.out.println("1-9の中で数字を入力してください");
				}

				else{
					if(flag!=1){
					kuku(x, y);
					break;
					}
				}





			}
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