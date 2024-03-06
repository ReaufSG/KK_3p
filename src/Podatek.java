import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double podstan = 0.04;
        double podlok = 0.02;
        int cena = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cena: " + cena + "\nPodatek stanowy: " + (podstan * cena) + "\nPodatek: " + (podlok * cena)
        + "\nSuma: " + (cena + (cena * podstan) + (cena * podlok)));
    }
}
