package Lab2_;

import java.util.Scanner;
import java.util.ArrayList;



public class zad4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> liczby = new ArrayList<>(); //pusta lista
		
		System.out.println("Podaj liczbe, wcisniej enter,wpisz q aby zakonczyc");
		
		//nieskonczona petla
		while(true) {
			String input = scanner.next();
			//gdy wpisze q
			if(input.equalsIgnoreCase("q") ) {
				break;
			}
			
			int liczba = Integer.parseInt(input); /// zamiana stringow na ineger
			liczby.add(liczba);   
		}
		
		System.out.println(liczby);
		
		int ilosc = liczby.size(); //dlugosc na metody
		
		System.out.println("liczba elementow: " + ilosc);
		
		double suma = 0, srednia;
		
		for (int liczba : liczby) {
			suma += liczba;
		}
		
		srednia = suma/ilosc;
		System.out.println("suma: " + suma + " srednia: " + srednia);
		
		int min = liczby.get(0);
		for (int liczba : liczby) {
			
			if (min > liczba) {
				min = liczba;
			}
			
		}
		
		int max = liczby.get(0);
		for (int liczba : liczby) {
			
			if (max < liczba) {
				max = liczba;
			}
		}
		System.out.println(" minimalna: " + min + " maxymalna: " + max);
		
		scanner.close();
	}
}
