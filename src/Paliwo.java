import java.util.Scanner;

public class Paliwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj przejechane kilometry: ");
        double przejechanekm = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj ilość zużytego paliwa: ");
        double litrypaliwa = scanner.nextInt();
        scanner.nextLine();
        double kilometrynalitr = przejechanekm/litrypaliwa;
        System.out.println("Spalanie wynosi: " + kilometrynalitr + " km/l");

    }
}
