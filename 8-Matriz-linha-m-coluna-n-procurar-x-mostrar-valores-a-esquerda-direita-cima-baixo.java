package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.print("Matrix order? ");
		int m = sc.nextInt();
		int n = sc.nextInt();		
		int[][] matrix = new int[m][n];
 			
		System.out.println("Enter the numbers: ");
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Enter a number to find: ");
		int x = sc.nextInt();

		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				if (matrix[i][j] == x) {
					System.out.println("Position " + i + "," + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Right: " + matrix[i+1][j]);
					}
				
				}
				
			}
		}
		
		sc.close();
	}
}
