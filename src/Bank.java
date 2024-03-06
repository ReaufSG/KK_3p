import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość czeków: ");
        int ilośćChecków = scanner.nextInt();
        scanner.nextLine();

        int opłata = 10;

        if(ilośćChecków < 20) {
            System.out.println("Opłata za czek wynosi: " + (float) (opłata + ilośćChecków * 0.1) + " zł.");
        } else if(ilośćChecków >= 20 && ilośćChecków <= 39) {
            System.out.println("Opłata za czek wynosi: " + (float) (opłata + ilośćChecków * 0.08) + " zł.");
        } else if(ilośćChecków >= 40 && ilośćChecków <= 59) {
            System.out.println("Opłata za czek wynosi: " + (float) (opłata + ilośćChecków * 0.06) + " zł.");
        } else if(ilośćChecków >= 60) {
            System.out.println("Opłata za czek wynosi: " + (float) (opłata + ilośćChecków * 0.04) + " zł.");
        } else {
            System.out.println("Błędna ilość czeków");
        }

    }
}
