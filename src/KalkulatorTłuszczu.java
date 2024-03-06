import java.util.Scanner;

public class KalkulatorTłuszczu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość kalorii: ");
        double kalorie = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj ilość tłuszczu w gr: ");
        double tłuszcz = scanner.nextInt();
        scanner.nextLine();

        double kalorieZTłuszczu = tłuszcz * 9;
        double procentTłuszczu = kalorieZTłuszczu * 100 / kalorie;

        if (procentTłuszczu < 30) {
            System.out.println("% kalorii z tłuszczu: "+ procentTłuszczu +" Niskotłuszczowy.");
        } else {
            System.out.println("% kalorii z tłuszczu: " + procentTłuszczu);
        }

    }
}
