import java.util.Scanner;

public class Ciastka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kalorie = 300;
        int porcje = 10;
        int ciastka = 40;
        System.out.println("Ile ciastek zjadłeś: ");
        int zjedzone = scanner.nextInt();
        double kaloriezjedzonych = (double)  zjedzone*(kalorie / (ciastka/porcje));
        System.out.println("Zjedzone kalorie: " + kaloriezjedzonych);

    }
}
