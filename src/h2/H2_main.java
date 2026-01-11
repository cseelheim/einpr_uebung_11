package h2;

public class H2_main {
	private static int[] cachedFibonacciResults = new int[1000];

	public static void main(String[] args) {
		benchmark(1);

		System.out.println();

		benchmark(2);

		System.out.println();

		benchmark(6);

		System.out.println();

		benchmark(6);

		System.out.println();

		benchmark(25);

		System.out.println();

		benchmark(40);

		System.out.println();

		benchmark(40);
	}

	public static void benchmark(int n) {
		long startNanoTime, durationNanoseconds;
		int result;

		System.out.println("Benchmark fibonacci methods for n = " + n);

		startNanoTime = System.nanoTime();
		result = fibonacci(n);
		durationNanoseconds = System.nanoTime() - startNanoTime;
		System.out.println("Elapsed nanoseconds (fibonacci): " + durationNanoseconds + ", result: " + result);

		startNanoTime = System.nanoTime();
		result = fibonacciCached(n);
		durationNanoseconds = System.nanoTime() - startNanoTime;
		System.out.println("Elapsed nanoseconds (fibonacciCached): " + durationNanoseconds + ", result: " + result);

		startNanoTime = System.nanoTime();
		result = fibonacciIterative(n);
		durationNanoseconds = System.nanoTime() - startNanoTime;
		System.out.println("Elapsed nanoseconds (fibonacciIterative): " + durationNanoseconds + ", result: " + result);
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;

		if (n == 1 || n == 2)
			return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int fibonacciCached(int n) {
		if (cachedFibonacciResults[n] != 0)
			return cachedFibonacciResults[n];

		int result = fibonacci(n);
		cachedFibonacciResults[n] = result;

		return result;

	}

	public static int fibonacciIterative(int n) {
		int result = 1;
		int a = 0;
		int b = 1;

		for (int i = 2; i <= n; i++) {
			result = a + b;
			a = b;
			b = result;
		}

		return result;
	}

}
