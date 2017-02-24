import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {
	public static long prodHorz(int[][] grid, int i, int j) {
		return grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
	}

	public static long prodVert(int[][] grid, int i, int j) {
		return grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
	}

	public static long prodDiagPlusPlus(int[][] grid, int i, int j) {
		return grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2]
				* grid[i + 3][j + 3];
	}

	public static long prodDiagPlusMinus(int[][] grid, int i, int j) {
		return grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2]
				* grid[i + 3][j - 3];
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> intArray = new ArrayList<>(0);
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("Problem11data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (scanner.hasNextInt()) {
			intArray.add(scanner.nextInt());
		}

		int[][] grid = new int[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				grid[i][j] = intArray.get(i * 20 + j);
			}
		}

		long maxProd = 0;

		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 20; j++) {
				if (prodVert(grid, i, j) >= maxProd)
					maxProd = prodVert(grid, i, j);
			}
		}

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 17; j++) {
				if (prodHorz(grid, i, j) >= maxProd)
					maxProd = prodHorz(grid, i, j);
			}
		}

		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				if (prodDiagPlusPlus(grid, i, j) >= maxProd)
					maxProd = prodDiagPlusPlus(grid, i, j);
			}
		}

		for (int i = 0; i < 17; i++) {
			for (int j = 3; j < 20; j++) {
				if (prodDiagPlusMinus(grid, i, j) >= maxProd)
					maxProd = prodDiagPlusMinus(grid, i, j);
			}
		}

		System.out.println(maxProd);

	}
}
