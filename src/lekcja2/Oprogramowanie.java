package lekcja2;

import java.util.Scanner;

public class Oprogramowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość kupionych pakietów oprogramowania: ");
        int ilośćPakietów = scanner.nextInt();
        scanner.nextLine();
        int cena = 99;
        if (ilośćPakietów < 10) {
            System.out.println("Cena za pakiet wynosi: " + (float) cena * ilośćPakietów + " zł");
        } else if (ilośćPakietów <= 19) {
            System.out.println("Cena za pakiet wynosi: " + (float) cena * ilośćPakietów * 0.8 + " zł. Rabat 20%");
        } else if (ilośćPakietów <= 49) {
            System.out.println("Cena za pakiet wynosi: " + (float) cena * ilośćPakietów * 0.7 + " zł. Rabat 30%");
        } else if (ilośćPakietów <= 99) {
            System.out.println("Cena za pakiet wynosi: " + (float) cena * ilośćPakietów * 0.6 + " zł. Rabat 40%");
        } else {
            System.out.println("Cena za pakiet wynosi: " + (float) cena * ilośćPakietów * 0.5 + " zł. Rabat 50%");
        }

    }
}
