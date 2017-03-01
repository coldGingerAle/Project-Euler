
public class Problem2 {
	public static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; fib(i) < 4000000; i++) {
			if (fib(i) % 2 == 0)
				sum += fib(i);
		}
		System.out.println(sum);
	}
}
