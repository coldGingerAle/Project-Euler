import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Problem13 {
	public static void main(String[] args) {
	
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("Problem13data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long sum = 0;
		
		while (scanner.hasNextLine()) {
			sum += (Long.parseLong(scanner.nextLine().substring(0,11)));
		}
		
		System.out.println(sum);
		
		
		
	}
}
