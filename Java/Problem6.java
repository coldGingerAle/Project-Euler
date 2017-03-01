
public class Problem6 {
	public static void main(String[] args) {
		int sumA = 0;
		for (int i = 1; i <= 100; i++) {
			sumA += i * i;
		}
		
		int sumB = 0;
		for (int i = 1; i <= 100; i++) {
			sumB += i;
		}
		
		System.out.println(sumB * sumB - sumA);
	}
}
