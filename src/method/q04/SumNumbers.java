package method.q04;

public class SumNumbers {
	public static int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int Number1 = 3;
		int Number2 = 2;

		int result = calculateSum(Number1, Number2);

		System.out.println("第一引数:" + Number1);
		System.out.println("第二引数:" + Number2);
		System.out.println("加算結果:" + result);

	}

}
