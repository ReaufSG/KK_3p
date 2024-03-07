package lekcja3;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę od 10 do 24: ");
        i = scanner.nextInt();
        while (!(i > 10 && i < 24)) {
            System.out.println("Liczba spoza zakresu. Podaj liczbę od 10 do 24: ");
            i = scanner.nextInt();
        }
        System.out.println("Podano poprawną liczbę.");

    }
}
