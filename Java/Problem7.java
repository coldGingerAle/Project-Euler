
public class Problem7 {
	public static boolean prime(long number) {
		boolean isPrime = true;
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				isPrime = false;
		}
		return isPrime;
	}

	public static void main(String[] args) {

		int counter = 0;
		for (int i = 2; counter <= 10001; i++) {
			if (prime(i)) {
				counter++;
				if (counter == 10001)
					System.out.println(i);
			}
		}
	}
}
