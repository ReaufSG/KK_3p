import java.util.Scanner;

public class Winnica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość rzędu: ");
        int długośćRzędu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj miejsce zajmowane przez okratowanie: ");
        int okratowanie = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj odległość między sadzonkami: ");
        int odległośćMiędzySadzonkami = scanner.nextInt();
        scanner.nextLine();

        int ilośćSadzonek = (długośćRzędu - 2 * okratowanie) / odległośćMiędzySadzonkami;
        System.out.println("Ilość sadzonek w jednym rzędzie: " + ilośćSadzonek);


    }
}
