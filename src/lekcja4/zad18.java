package lekcja4;

import java.util.Random;
import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {

        //18. Rozwinięcie zabawy w odgadywanie liczby losowej
        //Rozwiń program napisany w zadaniu programistycznym 17., aby zliczał próby odgadnięcia
        //liczby przez użytkownika. Po poprawnym odgadnięciu liczby losowej program
        //powinien wyświetlać liczbę prób.

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("Zgadnij liczbę z zakresu 1-100.");
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        while (true) {
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
                attempts++;
            } else if (guess < number) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
                attempts++;
            } else {
                System.out.println("Gratulacje, zgadłeś liczbę!");
                System.out.println("Liczba prób: " + attempts);
                break;
            }
        }


    }
}
