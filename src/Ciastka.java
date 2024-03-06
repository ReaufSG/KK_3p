import java.util.Scanner;

public class Ciastka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double kalorie = 300;
        double porcje = 10;
        double ciastka = 40;
        System.out.println("Ile ciastek zjadłeś: ");
        int zjedzone = scanner.nextInt();
        scanner.nextLine();
        double kaloriezjedzonych = (double)  zjedzone*(kalorie / (ciastka/porcje));
        System.out.println("Zjedzone kalorie: " + kaloriezjedzonych);

    }
}
