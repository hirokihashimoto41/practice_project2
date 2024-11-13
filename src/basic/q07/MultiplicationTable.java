package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 九九の計算
		for (int i = 1; i <= 9; i++) { //行
			for (int j = 1; j <= 9; j++) { //列
				// mに掛け算の結果を代入
				int m = i * j;

				System.out.print(" ");

				if (10 > m)
					System.out.print(" ");

				System.out.print(m);
			}

			System.out.println();
		}
	}
}
