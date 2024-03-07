package lekcja4;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {

        //10. Największa i najmniejsza wartość
        //Napisz program z pętlą umożliwiający użytkownikowi podanie serii liczb całkowitych.
        //Użytkownik powinien wpisać –99, aby zasygnalizować koniec serii. Po wpisaniu wszystkich
        //liczb program powinien wyświetlać największą i najmniejszą wprowadzoną wartość.

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Podaj liczbę całkowitą.");
            int a = scanner.nextInt();
            if (a == -99) {
                break;
            }
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Największa wartość: " + max);
        System.out.println("Najmniejsza wartość: " + min);


    }
}
