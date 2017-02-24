
public class Project5 {
	public static int largestPower(int num, int cap) {
		int power = 0;
		
		for (int i = 1; Math.pow(num, i) <= cap; i++) {
			power += 1;
		}
		
		return (int) Math.pow(num, power);
	}
	
	public static boolean prime(long number) {
		boolean isPrime = true;
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				isPrime = false;
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		long prod = 1;
		for (int i = 2; i <= 20; i++) {
			if (prime(i)) {
				prod *= largestPower(i, 20);
			}
		}
		System.out.println(prod);


	}
}
