package Lab2_;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i - 1; j++) {
				
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) +1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
