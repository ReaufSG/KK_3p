package lekcja3;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tak lub nie: ");
        String tekst = scanner.nextLine();
        while (!tekst.equals("tak") && !tekst.equals("nie")) {
            System.out.println("Złe wyrażenie. Podaj tak lub nie: ");
            tekst = scanner.nextLine();
        }
        System.out.println("Podano poprawny wyraz.");
    }
}
