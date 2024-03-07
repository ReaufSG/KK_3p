package lekcja4;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        //8. Średni poziom opadów
        //Napisz program, który za pomocą pętli zagnieżdżonych pobiera dane, a następnie
        //oblicza średni poziom opadów z określonej liczby lat. Program najpierw powinien
        //wyświetlać pytanie o liczbę lat. Pętla zewnętrzna powinna wykonywać jedną iterację
        //dla każdego roku. Pętla wewnętrzna powinna wykonywać 12 iteracji (raz dla każdego
        //miesiąca). W każdej iteracji pętli wewnętrznej należy wyświetlać pytanie o liczbę centymetrów
        //opadów w danym miesiącu. Po wszystkich iteracjach program powinien
        //wyświetlać liczbę miesięcy, łączną liczbę centymetrów opadów i średni poziom opadów
        //w danym miesiącu z całego okresu.
        //Sprawdzanie poprawności danych wejściowych: Przy pobieraniu liczby lat nie należy akceptować
        //wartości mniejszych niż 1. Przy pobieraniu miesięcznych opadów nie należy akceptować
        //wartości ujemnych.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę lat.");
        int years = scanner.nextInt();
        int months = 0;
        double rain = 0;
        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println("Podaj liczbę centymetrów opadów w miesiącu " + j + " roku " + i);
                double cm = scanner.nextDouble();
                if (cm < 0) {
                    System.out.println("Liczba centymetrów opadów nie może być ujemna.");
                    j--;
                } else {
                    months++;
                    rain += cm;
                }
            }
        }
        System.out.println("Liczba miesięcy: " + months);
        System.out.println("Łączna liczba centymetrów opadów: " + rain);
        System.out.println("Średni poziom opadów: " + rain / months);


    }
}
