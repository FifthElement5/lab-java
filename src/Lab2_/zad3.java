package Lab2_;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the conversion type
        System.out.println("Podaj, czy chcesz przekształcić prędkość w (1) milach/h czy (2) kilometrach/h?");
        int wybor = scanner.nextInt();

        if (wybor == 1) {
           
            System.out.println("Podaj predkosc w milach/h : ");
            double mila = scanner.nextDouble();

            double kilometr = mila * 1.609344;
            System.out.println("Predkosc w kilometrach to : " + kilometr);
        } else if (wybor == 2) {
            
            System.out.println("Podaj predkosc w kilometrach/h : ");
            double kilometr = scanner.nextDouble();

            double mila = kilometr / 1.609344;
            System.out.println("Predkosc w milach to : " + mila);
        }

        scanner.close();
    }
}
