import java.util.ArrayList;

public class Problem12 {

	public static ArrayList<Integer> primeFactors(int n) {
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int factor = 2; factor * factor <= n; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= n; j++) {
					isPrime[factor * j] = false;
				}
			}
		}

		ArrayList<Integer> primes = new ArrayList<>(0);

		for (int i = 2; i <= n; i++) {
			if (isPrime[i] && n % i == 0) {
				primes.add(i);
			}
		}

		return primes;
	}

	public static int power(int factor, int n) {
		int count = 0;
		while (n % factor == 0) {
			n /= factor;
			count++;
		}
		return count;
	}

	public static int triangle(int n) {
		return n * (n + 1) / 2;
	}

	public static void main(String[] args) {

		long max = 0;
		for (int i = 2; ; i++) {
			
			long prodAccum = 1;
			for (Integer integer : primeFactors(triangle(i))) {
				prodAccum *= (1 + power(integer, triangle(i)));
			}
			if (prodAccum >= max) {
				max = prodAccum;
				System.out.println(i + ": " + triangle(i) + ": " + prodAccum);
				if (prodAccum >= 500) break;
			}
		}
	}
//took 1 hour and 30 minutes to output
//	2: 3: 2
//	3: 6: 4
//	4: 10: 4
//	5: 15: 4
//	6: 21: 4
//	7: 28: 6
//	8: 36: 9
//	15: 120: 16
//	20: 210: 16
//	24: 300: 18
//	32: 528: 20
//	35: 630: 24
//	39: 780: 24
//	44: 990: 24
//	48: 1176: 24
//	55: 1540: 24
//	56: 1596: 24
//	63: 2016: 36
//	80: 3240: 40
//	95: 4560: 40
//	104: 5460: 48
//	119: 7140: 48
//	135: 9180: 48
//	143: 10296: 48
//	144: 10440: 48
//	175: 15400: 48
//	195: 19110: 48
//	207: 21528: 48
//	215: 23220: 48
//	216: 23436: 48
//	224: 25200: 90
//	384: 73920: 112
//	560: 157080: 128
//	935: 437580: 144
//	1215: 738720: 144
//	1224: 749700: 162
//	1664: 1385280: 168
//	1728: 1493856: 192
//	2015: 2031120: 240
//	2079: 2162160: 320
//	4640: 10767120: 320
//	5264: 13857480: 320
//	5984: 17907120: 480
//	12375: 76576500: 576
}
