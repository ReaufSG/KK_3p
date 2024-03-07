package lekcja4;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {

        //16. Analiza budżetu
        //Napisz program, który wyświetla użytkownikowi prośbę o podanie miesięcznego budżetu.
        //Następnie program powinien w pętli pobierać wydatki użytkownika z danego miesiąca
        //i obliczać sumę bieżącą. Po zakończeniu pętli program powinien wyświetlać różnicę
        //między wydaną kwotą a budżetem.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesięczny budżet.");
        int budżet = scanner.nextInt();
        int wydatki = 0;
        while (true) {
            System.out.println("Podaj wydatek.");
            int wydatek = scanner.nextInt();
            if (wydatek == 0) {
                break;
            }
            wydatki += wydatek;
        }
        System.out.println("Różnica między wydaną kwotą a budżetem: " + (budżet - wydatki));

    }
}
