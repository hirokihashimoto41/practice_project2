package method.q05;

public class Triangle {
	public static int getTriangleArea(int num1, int num2, int num3) {
		return num1 * num2 / num3;
	}

	public static void main(String[] args) {
		int Number1 = 8;
		int Number2 = 5;
		int Number3 = Number1 * Number2 / 2;

		int result = getTriangleArea(Number1, Number2, Number3);

		System.out.println("底辺:" + Number1);
		System.out.println("高さ:" + Number2);
		System.out.println("三角形の面積:" + Number3);

	}

}
