package lekcja4;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {

        //9. Populacja organizmów
        //Napisz program prognozujący wielkość populacji organizmów. Program powinien
        //wyświetlać prośbę o podanie początkowej liczby organizmów, średni dzienny przyrost
        //populacji (w procentach) i liczbę dni, przez jakie organizmy się rozmnażają. Załóżmy,
        //że populacja początkowo liczy dwa organizmy, średni dzienny przyrost wynosi 50%,
        //a czas rozmnażania to siedem dni. Program powinien używać pętli do wyświetlania
        //wielkości populacji każdego dnia.
        //Sprawdzanie poprawności danych wejściowych: Przy pobieraniu początkowej wielkości
        //populacji nie należy akceptować wartości mniejszych niż 2. Przy pobieraniu średniego dziennego
        //przyrostu populacji należy odrzucać wartości ujemne. Z kolei przy pobieraniu dni rozmnażania
        //nie należy przyjmować wartości mniejszych niż 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj początkową liczbę organizmów, średni dzienny przyrost populacji (w procentach) oraz liczbę dni, przez jakie organizmy się rozmnażają.");
        int organisms = scanner.nextInt();
        double growth = scanner.nextDouble();
        int days = scanner.nextInt();
if (organisms < 2 || growth < 0 || days < 1) {
            System.out.println("Niepoprawne dane wejściowe.");
            return;
        }
        for (int i = 1; i <= days; i++) {
            System.out.println(i + " dzień: " + organisms + " organizmów");
            organisms += organisms * growth / 100;
        }

    }
}
