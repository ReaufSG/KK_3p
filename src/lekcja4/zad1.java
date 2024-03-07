package lekcja4;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        //Napisz program, który prosi o podanie dodatniej niezerowej liczby całkowitej. Program
        //powinien używać pętli do obliczania sumy wszystkich liczb całkowitych z przedziału
        //od 1 do wprowadzonej liczby. Jeśli użytkownik wpisał np. 50, pętla powinna
        //obliczyć sumę ciągu 1, 2, 3, 4, …, 50.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą dodatnią niezerową");
        int a = scanner.nextInt();
        int wynik = 0;
        for (int i = 1; i <= a; i++) {
            wynik += i;
        }
        System.out.println(wynik);

    }
}
