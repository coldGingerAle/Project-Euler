
public class Problem10 {
	public static boolean prime(long number) {
		boolean isPrime = true;
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				isPrime = false;
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long sumAccum = 0;
		for (long i = 2; i < 2000000; i++) {
			if (prime(i)) {
				sumAccum += i;
			}
		}
		
		System.out.println(sumAccum);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}

