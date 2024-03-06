package lekcja2;

import java.util.Scanner;

public class LiczbyRzymskie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz tryb: 1 - liczba na rzymską, 2 - rzymska na liczbę");
        int tryb = scanner.nextInt();
        scanner.nextLine();
        if(tryb == 1){

        System.out.println("Podaj liczbę od 1 do 10: ");
        String[] liczbyRzymskie = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int liczba = scanner.nextInt();
        scanner.nextLine();
        if (liczba < 1 || liczba > 10) {
            System.out.println("Podano liczbę spoza zakresu.");
        } else {
            System.out.println("Liczba rzymska: " + liczbyRzymskie[liczba - 1]);
        }
        } else if(tryb == 2){
            String[] liczbyRzymskie = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            System.out.println("Podaj liczbę rzymską od I do X: ");
            String liczbaRzymska = scanner.nextLine();
            int liczba = 0;
            for (int i = 0; i < liczbyRzymskie.length; i++) {
                if (liczbaRzymska.equals(liczbyRzymskie[i])) {
                    liczba = i + 1;
                    break;
                }
            }
            if (liczba == 0) {
                System.out.println("Podano liczbę spoza zakresu.");
            } else {
                System.out.println("Liczba: " + liczba);
            }

        }
    }
}
