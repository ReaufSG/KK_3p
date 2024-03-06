import java.util.Scanner;

public class SzybkośćDźwięku {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj odległość: ");
        double odległość = scanner.nextInt();
        scanner.nextLine();
        double powietrze = 343;
        double woda = 1490;
        double stal = 5100;
        double czas;

        System.out.println("Podaj środowisko: powietrze, woda, stal.");
        String środowisko = scanner.nextLine();

        switch (środowisko) {
            case "powietrze" -> czas = odległość / powietrze;
            case "woda" -> czas = odległość / woda;
            case "stal" -> czas = odległość / stal;
            default -> {
                System.out.println("Podaj środowisko: powietrze, woda, stal.");
                return;
            }
        }
        System.out.println("Odległość: " + odległość + " m zostanie pokonana w czasie: " + czas + " s.");

    }
}
