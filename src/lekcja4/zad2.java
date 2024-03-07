package lekcja4;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        //2. Przebyta odległość
        //Odległość przebytą przez pojazd można obliczyć w następujący sposób:
        //odległość = szybkość × czas
        //Na przykład jeśli pociąg jedzie z prędkością 40 km/h przez trzy godziny, to przejechana
        //odległość wynosi 120 kilometrów. Napisz program, który wyświetla prośbę
        //o podanie szybkości pojazdu (w kilometrach na godzinę) i liczbę godzin podróży.
        //Program powinien wyświetlać w pętli odległość przebytą po każdej godzinie okresu
        //podanego przez użytkownika. Jeśli np. pojazd przez trzy godziny jedzie z szybkością
        //40 km/h, należy wyświetlić informacje podobne do poniższych:
        //Godzina Przebyta odległość
        //-----------------------------
        //1 40
        //2 80
        //3 120
        //Sprawdzanie poprawności danych wejściowych: Program nie powinien akceptować ujemnych
        //prędkości i wartości czasu mniejszych niż 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj prędkość pojazdu (w km/h) oraz czas podróży (w godzinach)");
        int speed = scanner.nextInt(), time = scanner.nextInt();
        for (int i = 1; i <= time; i++) {
            System.out.println(i + " godzina: " + speed*i + " km");
        }

    }
}
