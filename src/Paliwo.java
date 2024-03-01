import java.util.Scanner;

public class Paliwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj przejechane kilometry: ");
        int przejechanekm = scanner.nextInt();
        System.out.println("Podaj ilość zużytego paliwa: ");
        int litrypaliwa = scanner.nextInt();
        double kilometrynalitr = przejechanekm/litrypaliwa;
        System.out.println("Spalanie wynosi: " + kilometrynalitr + " km/l");

    }
}
