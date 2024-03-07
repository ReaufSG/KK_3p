package lekcja4;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {

        //7. Obłożenie hotelu
        //Poziom obłożenia hotelu jest obliczany w następujący sposób:
        //poziom obłożenia = liczba zajętych pokojów/łączna liczba pokojów
        //Napisz program obliczający poziom obłożenia dla każdego piętra hotelu. Program powinien
        //wyświetlać prośbę o podanie liczby pięter, a następnie w pętli wykonywać jedną
        //iterację dla każdego piętra. W każdej iteracji pętla powinna wyświetlać prośbę o podanie
        //liczby wszystkich i zajętych pokojów z danego piętra. Po wszystkich iteracjach
        //program powinien wyświetlić łączną liczbę pokojów w hotelu, liczbę zajętych i pustych
        //pokojów, a także poziom obłożenia.
        //Sprawdzanie poprawności danych wejściowych: Przy pobieraniu liczby pięter nie należy
        //akceptować wartości mniejszych niż 1. Przy pobieraniu liczby pokojów na piętrze nie należy
        //akceptować wartości mniejszych niż 10.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pięter.");
        int floors = scanner.nextInt();
        int rooms1 = 0;
        int occupied2 = 0;
        for (int i = 1; i <= floors; i++) {
            System.out.println("\nPodaj liczbę pokojów na piętrze " + i);
            int rooms = scanner.nextInt();
            System.out.println("Podaj liczbę zajętych pokojów na piętrze " + i);
            int occupied = scanner.nextInt();
            System.out.println("Liczba pokojów: " + rooms);
            System.out.println("Liczba zajętych pokojów: " + occupied);
            System.out.println("Liczba wolnych pokojów: " + (rooms - occupied));
            System.out.printf("Poziom obłożenia: %6.2f" ,  ((double) occupied / rooms)*100);
            rooms1 += rooms;
            occupied2 += occupied;
        }
        System.out.println("\nŁączna liczba pokojów: " + rooms1);
        System.out.println("Liczba zajętych pokojów: " + occupied2);
        System.out.println("Liczba wolnych pokojów: " + (rooms1 - occupied2));
        System.out.printf("Poziom obłożenia: %6.2f" ,  ( (double)occupied2 / rooms1)*100);

    }
}
