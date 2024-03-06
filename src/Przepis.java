import java.util.Scanner;

public class Przepis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ciastka = 48;
        float mąka = 2.75f;
        int masło = 1;
        float cukier = 1.5f;

        System.out.println("Podaj oczekiwaną ilość ciasteczek:");
        int ilość = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Potrzebujesz:");
        System.out.println((float) ilość / ciastka * mąka + " szklanki mąki");
        System.out.println((float) ilość / ciastka * masło + " szklanki masła");
        System.out.println((float) ilość / ciastka * cukier + " szklanki cukru");

    }
}
