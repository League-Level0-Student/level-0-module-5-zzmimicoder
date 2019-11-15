package Fibonacci;
public class Fibonnaci {
	public static void main(String[] args) {
		int Num1 = 0;
		int Num2 = 1;
		System.out.println("0\n1");
		for (int X = 0; X < 10; X++) {
			System.out.println(Num1 + Num2);
			Num1 = Num1 + Num2;
			System.out.println(Num1 + Num2);
			Num2 = Num1 + Num2;
		}	
	}
}
