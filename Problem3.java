import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
	public static boolean prime(long number) {
		boolean isPrime = true;
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				isPrime = false;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		input.close();

		ArrayList<Long> primeFactors = new ArrayList<>(0);

		for (long i = 2; i < number / i; i++) {
			if (number % i == 0 && prime(i)) {
				primeFactors.add(i);
			}
		}

		System.out.println(primeFactors);
	}
}
