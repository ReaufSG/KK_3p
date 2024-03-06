import java.util.Scanner;

public class UlubioneMiasto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie jest Twoje ulubione miasto?");
        String miasto = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Twoje ulubione miasto to: " + miasto);
        System.out.println("Ma ono " + miasto.length() + " liter.");
        System.out.println(miasto.toUpperCase());
        System.out.println(miasto.toLowerCase());
        System.out.println(miasto.charAt(0));

    }
}
