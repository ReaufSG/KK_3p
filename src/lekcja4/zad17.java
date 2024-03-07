package lekcja4;

import java.util.Random;
import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {

        //17. Zabawa w odgadywanie liczby losowej
        //Napisz program, który generuje liczbę losową i wyświetla prośbę o jej odgadnięcie. Jeśli
        //użytkownik poda wartość wyższą od wygenerowanej liczby losowej, program powinien
        //wyświetlać tekst: „Za duża liczba, spróbuj ponownie”. Po podaniu wartości niższej
        //od wygenerowanej program powinien informować: „Za mała liczba, spróbuj ponownie”.
        //W programie należy zastosować pętlę powtarzającą operacje do czasu odgadnięcia
        //liczby losowej przez użytkownika.

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("Zgadnij liczbę z zakresu 1-100.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (guess < number) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else {
                System.out.println("Gratulacje, zgadłeś liczbę!");
                break;
            }
        }

    }
}
