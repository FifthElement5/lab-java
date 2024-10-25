package Lab2_;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj wartosc a:");
		
		double a = scanner.nextInt();
		
		System.out.println("podales a:" + a);
		
		System.out.println("Podaj wartosc b:");
		double b = scanner.nextInt();
		System.out.println("podales b: " + b);
		
		System.out.println("Podaj wartosc c:");
		double c = scanner.nextInt();
		System.out.println("podales c: " + c);
		
		double d = (b*b) - (4*a*c);
		System.out.println("Delta = " + d);
		
		//sprawdzamy warunki dla delty
		if(d < 0) {
			
			System.out.println("Brak rozwiazan: delta ujemna");
		} else if (d == 0) {
			double x1 = -b/(2*a);
			System.out.println("Jedno rozwiazanie : x1 = " + x1);
		} else {
			double x1 = (-b + Math.sqrt(d))/(2*a);
			double x2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Dwa rozwiaznia: x1 = " + x1 + " x2 = " + x2);
		}
		
		
		
		scanner.close();
		
	}
}
