package ForLoopGauntlet;
public class ForLoopGauntlet {
	public static void main(String[] args) {
		int A = 0;
		int B = 100;
		int C = 2;
		int D = 1;
		int E = 1;
		int F = 0;
		int G = 2008;
		for (A = A; A < 101; A++) {
			System.out.print(A + " ");
		}
		System.out.println("");
		for (B = B; B > 0; B--) {
			System.out.print(B + " ");
		}
		System.out.println("");
		for (C = C; C < 101; C++) {
			if (C % 2 == 0) {
				System.out.print(C + " ");
			}
		}
		System.out.println("");
		for (D = D; D < 100; D++) {
			if (D % 2 > 0) {
				System.out.print(D + " ");
			}
		}
		System.out.println("");
		for (E = E; E < 501; E++) {
			if (E % 2 == 0) {
				System.out.print(E + " Is Even; ");
			} else {
				System.out.print(E + " Is Odd; ");
			}
		}
		System.out.println("");
		for (F = F; F < 778; F++) {
			if (F % 7 == 0) {
				System.out.print(F + " ");
			}
		}
		System.out.println("");
		for (G = G; G < 2020; G++) {
			System.out.print("In " + G + ", I Was " + Integer.toString(G - 2008) + "; ");
		}
	}
}
