import java.util.Scanner;
public class KalkulatorCzasu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość sekund: ");
        int sekundy = scanner.nextInt();
        scanner.nextLine();
        int dzień = sekundy / 86400;
        int godziny = (sekundy % 86400) / 3600;
        int minuty = ((sekundy % 86400) % 3600) / 60;
        int pozostalesekundy = ((sekundy % 86400) % 3600) % 60;
        System.out.println("Dni: "+ dzień + " Godziny: " + godziny + " Minuty: " + minuty + " Sekundy: " + pozostalesekundy);

    }
}
