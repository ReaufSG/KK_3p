package lekcja2;

import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość książek: ");
        int ilośćKsiążek = scanner.nextInt();
        scanner.nextLine();

        int punkty;

        if(ilośćKsiążek == 0) {
            punkty = 0;
            System.out.println("Punkty: " + punkty);
        } else if(ilośćKsiążek == 1) {
            punkty = 5;
            System.out.println("Punkty: " + punkty);
        } else if(ilośćKsiążek == 2) {
            punkty = 15;
            System.out.println("Punkty: " + punkty);
        } else if(ilośćKsiążek == 3) {
            punkty = 30;
            System.out.println("Punkty: " + punkty);
        } else if(ilośćKsiążek >= 4) {
            punkty = 60;
            System.out.println("Punkty: " + punkty);
        }
    }
}
