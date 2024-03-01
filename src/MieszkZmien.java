import java.util.Scanner;

public class MieszkZmien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wymiary pokoi: ");

        System.out.println("Pokój 1: ");
        int pom1x = scanner.nextInt();
        int pom1y = scanner.nextInt();

        System.out.println("Pokój 2: ");
        int pom2x = scanner.nextInt();
        int pom2y = scanner.nextInt();

        System.out.println("Pokój 3: ");
        int pom3x = scanner.nextInt();
        int pom3y = scanner.nextInt();

        System.out.println("Pokój 4: ");
        int pom4x = scanner.nextInt();
        int pom4y = scanner.nextInt();

        int osoby = 4;

        System.out.println("Mieszkanie składa się z 4 pokoi:");
        System.out.println("Pokój 1: " + (pom1x * pom1y));
        System.out.println("Pokój 2: " + (pom2x * pom2y));
        System.out.println("Pokój 3: " + (pom3x * pom3y));
        System.out.println("Pokój 4: " + (pom4x * pom4y));
        System.out.println("Całkowita powierzchnia mieszkania: " + ((pom1x * pom1y) + (pom2x * pom2y) + (pom3x * pom3y) + (pom4x * pom4y)));
        System.out.println("Średnia powierzchnia na osobę: " + ((pom1x * pom1y + pom2x * pom2y + pom3x * pom3y + pom4x * pom4y) / osoby));
    }
}
