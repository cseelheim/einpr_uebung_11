package p1;

public class P1_main {

	public static void main(String[] args) {
		System.out.println("Potenz a^b rekursiv berechnet");
		System.out.println("1.3^0 = " + recursivePowerOf(1.3, 0));
		System.out.println("1.3^1 = " + recursivePowerOf(1.3, 1));
		System.out.println("1.8^5 = " + recursivePowerOf(1.8, 5));
		System.out.println("2.3^10 = " + recursivePowerOf(2.3, 10));

		System.out.println();
		System.out.println();

		System.out.println("Potenz a^b iterative berechnet");
		System.out.println("1.3^0 = " + iterativePowerOf(1.3, 0));
		System.out.println("1.3^1 = " + iterativePowerOf(1.3, 1));
		System.out.println("1.8^5 = " + iterativePowerOf(1.8, 5));
		System.out.println("2.3^10 = " + iterativePowerOf(2.3, 10));
	}

	public static double recursivePowerOf(double a, int b) {
		if (b == 0)
			return 1.0;

		return recursivePowerOf(a, b - 1) * a;
	}

	public static double iterativePowerOf(double a, int b) {
		double powerOf = 1.0;

		for (int i = 1; i <= b; i++) {
			powerOf = powerOf * a;
		}

		return powerOf;
	}
}
