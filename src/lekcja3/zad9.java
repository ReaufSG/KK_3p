package lekcja3;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a,b,wynik = 0;
        char znak;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            wynik += a + b;
            System.out.println("Czy kontunuować? t/n");
            znak = scanner.next().charAt(0);
        } while (znak == 't');

        System.out.println(wynik);
    }

}
