package Lab2_;

import java.util.Scanner;

public class zad5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double liczba1, liczba2;
		char operator;
		
		System.out.println("Podaj pierwsza liczbe: ");
		liczba1 = scanner.nextDouble();
		
		System.out.print("Podaj operator: ");
		operator = scanner.next().charAt(0);
		
		System.out.print("Podaj druga liczbe: ");
		liczba2 = scanner.nextDouble();
		
		double wynik;
		
		switch(operator) {
			case '+':
				wynik = liczba1 + liczba2;
				System.out.println("wynik: " + wynik);
				break;
			case '-':
				wynik = liczba1 - liczba2;
				System.out.println("wynik: " + wynik);
				break;
			case '*':
				wynik = liczba1 * liczba2;
				System.out.println("wynik: " + wynik);
				break;
			case '/': 
				wynik = liczba1 / liczba2;
			    if (liczba2 != 0) {
			    	wynik = liczba1/liczba2;
			    	System.out.println("wynik: " + wynik);
			    } else {
			    	System.out.println("Pamietaj selero nie dziel przez zero");
			    }
			    break;
			 default: System.out.println("Blad");
			   break;
		}
		
		scanner.close();
		
	}

}
