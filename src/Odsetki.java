import java.util.Scanner;

public class Odsetki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kapitał: ");
        double kapitał = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj oprocentowanie: ");
        double oprocentowanie = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj ile razy odsetki są kapitalizowane: ");
        int kapitalizacja = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj okres: ");
        int okres = scanner.nextInt();
        scanner.nextLine();

        double kwota = kapitał * Math.pow(1 + oprocentowanie / kapitalizacja, kapitalizacja * okres);
        System.out.printf("Kwota: %6.2f", kwota);


    }
}
