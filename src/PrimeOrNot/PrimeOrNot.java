package PrimeOrNot;
public class PrimeOrNot {
	public static void main(String[] args) {
		boolean Prime = true;
		int X = 0;
		int Y = 0;
		for (X = 5; X > 1; X++) {
			for (Y = 2; Y < X; Y++) {
				if (X % Y == 0) {
					Prime = false;
				}
			}
			if (Prime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
			System.out.println(X);
		}
	}
}
