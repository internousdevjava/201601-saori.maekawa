 /**
 *
 */

/**
 * @author internous
 *
 */

/*
 * 掛け算九九表の作作成
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		kuku(9, 9);
	}

		public static void kuku(int x, int y){
			for (int i = 1; i < 10; i++){
			  for (int j = 1; j < 10; j++){
				System.out.print(i * j);
				System.out.print(" ");
			}
			  System.out.println();
			}
		}



}