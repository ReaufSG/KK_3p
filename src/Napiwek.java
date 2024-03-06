import java.util.Scanner;

public class Napiwek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę: ");
        float cena = scanner.nextFloat();
        scanner.nextLine();
        double podatek = 0.0675;
        double napiwek = (cena + cena * podatek) * 0.2;
        System.out.println("Cena: " + cena);
        System.out.println("Podatek: " + cena * podatek);
        System.out.printf("Napiwek:%6.2f", napiwek);
        System.out.printf("\nRazem: " + (cena + napiwek + cena * podatek));

    }
}
