
public class Project4 {
	public static boolean isPalindromic(int number) {
		int[] numArray = new int[6];
		boolean palindrome = true;
		for (int i = 5; i >= 0; i--) {
			numArray[i] = number % 10;
			number /= 10;
		}
		for (int i = 0; i < 3; i++) {
			if (numArray[i] != numArray[5 - i])
				palindrome = false;
		}

		return palindrome;

	}

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter a 6 digit number:");
		// int number = scan.nextInt();
		// if (isPalindromic(number)) {
		// System.out.println("The number is palindromic.");
		// } else {
		// System.out.println("The number is not palindromic.");
		// }
		int largestPalindrome = 0;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (isPalindromic(i * j) && i * j > largestPalindrome) {
					largestPalindrome = i * j;
				}
			}
		}

		System.out.println(largestPalindrome);

	}
}
