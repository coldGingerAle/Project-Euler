
public class Problem9 {
	public static void main(String[] args) {
		for (int a = 1; a <= 1000; a++) {
			for (int b = 1; b <= 1000 - a - 1; b++) {
				for (int c = 1; c <= 1000 - a - b; c++) {
					if (a + b + c == 1000) {
						if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
							System.out.println(a * b * c);
						}
					}
				}
			}
		}
	}
}
