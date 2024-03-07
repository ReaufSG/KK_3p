package lekcja4;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {

        //Groszowe wypłaty
        //Napisz program, który oblicza kwotę zarabianą przez pracownika w określonym czasie.
        //Pierwszego dnia pracownik zarabia grosz, drugiego dwa grosze, a każdego następnego
        //— uzyskuje dwukrotność zapłaty za poprzedni dzień. Program powinien
        //wyświetlać tabelę z wynagrodzeniem za każdy dzień, a następnie sumaryczną zapłatę
        //za cały okres. Dane wyjściowe należy wyświetlać w złotych, a nie w groszach.
        //Sprawdzanie poprawności danych wejściowych: Przy pobieraniu liczby przepracowanych
        //dni nie należy akceptować wartości mniejszych niż 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dni.");
        int dni = scanner.nextInt();

        for (double i = 1, j = 0.01; i <= dni; i++,j*=2) {
            System.out.println((int) i + " dzień: " + j + " zł.");
        }

    }
}
