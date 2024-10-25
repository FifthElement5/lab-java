package Lab2_;

import java.util.Scanner;

public class zad6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj kwote pozyczki (do 300 tys PLN): ");
		double pozyczka = scanner.nextDouble();
		
		System.out.println("Podaj kwote kapitalu wlasnego: ");
		double wlasny = scanner.nextDouble();
		
		System.out.println("Podaj liczbe rat (max 96 miesiecy): ");
		double liczbaRat = scanner.nextDouble();
		
		double pozyczkaPo = pozyczka - wlasny;
		
		int procent = 0;
		if(liczbaRat <= 24) {
			procent = 2;
		} else if (liczbaRat <= 48) {
			procent = 3;
		} else if (liczbaRat <= 60) {
			procent = 4;
		} else if (liczbaRat <= 72) {
			procent = 5;
		} else if (liczbaRat <= 96) {
			procent = 6;
		}
		
		double procentPo = ((double)procent/100)/12;
		System.out.println("procent: " + procent + " obliczony " + procentPo);
		
		double wynik = pozyczkaPo * (procentPo *( Math.pow((1 + procentPo), liczbaRat))/(Math.pow((1 + procentPo), liczbaRat ) - 1));
		
		System.out.println("miesieczna rata: " + wynik);
		scanner.close();
	}
}
