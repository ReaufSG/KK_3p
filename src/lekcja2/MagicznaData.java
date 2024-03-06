package lekcja2;

import java.util.Scanner;

public class MagicznaData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzień: ");
        int dzień = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj miesiąc: ");
        int miesiąc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj rok: ");
        int rok = scanner.nextInt();
        scanner.nextLine();
        if(miesiąc * dzień == rok % 100){
            System.out.println("Magiczna data");
        } else {
            System.out.println("Nie magiczna data");
        }
    }
}
