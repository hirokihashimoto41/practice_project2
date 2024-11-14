package method.q10;

import java.util.Arrays;   //java.util.Arrays;...配列の要素をコンソールにに出力する

public class EvenNumber {

	public static int getEvenNumbers(int[] numbers) {
		int count = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] numbers = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		System.out.println(Arrays.toString(numbers));

		int evenCount = getEvenNumbers(numbers);

		System.out.println("には、偶数が" + evenCount + "個あります。");
	}
}
