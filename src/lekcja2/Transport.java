package lekcja2;

import java.util.Scanner;

public class Transport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę przesyłki: ");
        double waga = scanner.nextInt();
        System.out.println("Podaj ilość kilometrów: ");
        double kilometry = scanner.nextInt();
        double dystans = 500;

        if (waga <= 1) {
            double cena = 1.10 * Math.ceil(kilometry/dystans);
            System.out.println("Cena za przesyłkę wynosi: " + cena + " zł");
        } else if (waga <= 3) {
            double cena = 2.20 * Math.ceil(kilometry/dystans);
            System.out.println("Cena za przesyłkę wynosi: " + cena + " zł");
        } else if (waga <= 5) {
            double cena = 3.70 * Math.ceil(kilometry/dystans);
            System.out.println("Cena za przesyłkę wynosi: " + cena + " zł");
        } else {
            double cena = 3.80 * Math.ceil(kilometry/dystans);
            System.out.println("Cena za przesyłkę wynosi: " + cena + " zł");
        }
    }
}
