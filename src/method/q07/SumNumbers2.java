package method.q07;

public class SumNumbers2 {
	public static int calculateSum(int num1, double num2) {
		return (int) (num1 + num2);   //実数を整数に変換
	}

	public static void main(String[] args) {
		int Number1 = 5;
		double Number2 = 3.3;

		int result = calculateSum(Number1, Number2);

		System.out.println("第一引数(整数):" + Number1);
		System.out.println("第二引数(実数):" + Number2);
		System.out.println("加算結果:" + result);

	}

}