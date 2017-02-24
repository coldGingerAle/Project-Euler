public class Problem10Sieve {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		boolean[] isPrime = new boolean[2000001];
		for (int i = 2; i <= 2000000; i++) {
			isPrime[i] = true;
		}

		for (int factor = 2; factor * factor <= 2000000; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= 2000000; j++) {
					isPrime[factor * j] = false;
				}
			}
		}

		long total = 0;

		for (int i = 2; i <= 2000000; i++) {
			if (isPrime[i]) {
				total += i;

			}
		}

		System.out.println(total);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}
}
