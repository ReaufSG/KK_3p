package lekcja3;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak t, T, n lub N: ");
        char znak = scanner.next().charAt(0);
        znak = Character.toLowerCase(znak);
        while (znak != 't' && znak != 'n') {
            System.out.println("Podaj znak t, T, n lub N: ");
            znak = scanner.next().charAt(0);
            znak = Character.toLowerCase(znak);
        }
        System.out.println("Podano poprawny znak.");

    }
}
