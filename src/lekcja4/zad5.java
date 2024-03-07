package lekcja4;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {

        //5. Licznik liter
        //Napisz program, który wyświetla prośbę o podanie łańcucha znaków, a następnie
        //o wprowadzenie znaku. Program powinien zliczać i wyświetlać liczbę wystąpień określonego
        //znaku w łańcuchu.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków.");
        String a = scanner.nextLine();
        System.out.println("Podaj znak.");
        char b = scanner.next().charAt(0);
        int wynik = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                wynik++;
            }
        }
        System.out.println(wynik);

    }
}
