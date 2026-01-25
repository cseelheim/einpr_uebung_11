package p2;

public class P2_main {

	public static void main(String[] args) {
		System.out.println("Zweierlogarithmus 2^a rekursiv berechnet");
		System.out.println("1 = " + recursiveLog2(1));
		System.out.println("16 = " + recursiveLog2(16));
		System.out.println("32 = " + recursiveLog2(32));

		System.out.println();
		System.out.println();

		System.out.println("Zweierlogarithmus 2^a iterative berechnet");
		System.out.println("1 = " + iterativeLog2(1));
		System.out.println("16 = " + iterativeLog2(16));
		System.out.println("32 = " + iterativeLog2(32));
	}

	public static int recursiveLog2(int a) {
		if (a == 1)
			return 0;

		return 1 + recursiveLog2(a / 2);
	}

	public static int iterativeLog2(int a) {
		int base = a;
		int counter = 0;

		while (base % 2 == 0 && base >= 2) {
			counter++;
			base = base / 2;
		}

		return counter;
	}
}
