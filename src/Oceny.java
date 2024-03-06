import java.util.Scanner;
public class Oceny {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ocenę 1: ");
        int ocena1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj ocenę 2: ");
        int ocena2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj ocenę 3: ");
        int ocena3 = scanner.nextInt();
        scanner.nextLine();
        double średnia = (double) (ocena1 + ocena2 + ocena3) / 3;
        System.out.printf("Średnia ocen: %6.2f" , średnia);
        if(średnia >= 90){
            System.out.println("\nCelujący");
        } else if(średnia >= 80){
            System.out.println("\nBardzo dobry");
        } else if(średnia >= 70){
            System.out.println("\nDobry");
        } else if(średnia >= 60){
            System.out.println("\nDostateczny");
        } else {
            System.out.println("\nNiedostateczny");
        }

    }
}
