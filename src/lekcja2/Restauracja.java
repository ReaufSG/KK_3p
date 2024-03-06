package lekcja2;

import java.util.Scanner;

public class Restauracja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej? (t/n)");
        char wege = scanner.next().charAt(0);
        System.out.println("Czy któraś z osób jest na diecie wegańskiej? (t/n)");
        char wega = scanner.next().charAt(0);
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej? (t/n)");
        char glut = scanner.next().charAt(0);

        System.out.println("Możecie wybrać się do następujących restauracji: ");
        if(wege == 'n') {
            if(wega == 'n') {
                if(glut == 'n') {
                    System.out.println("Luksusowe burgery u Jacka");
                    System.out.println("Pizzeria przy Dworcowej");
                    System.out.println("Włoskie specjały");
                    System.out.println("Kuchnia u szefa");
                    System.out.println("Kawiarnia na rogu");
                } else {
                    System.out.println("Pizzeria przy Dworcowej");
                }
            } else {
                    System.out.println("Kawiarnia na rogu");
                    System.out.println("Kuchnia u szefa");
            }
        } else {
            if(wega == 't') {
                    System.out.println("Kawiarnia na rogu");
                    System.out.println("Kuchnia u szefa");
            } else {
                if(glut == 't') {
                    System.out.println("Kawiarnia na rogu");
                    System.out.println("Kuchnia u szefa");
                    System.out.println("Pizzeria przy Dworcowej");
                } else {
                    System.out.println("Kawiarnia na rogu");
                    System.out.println("Kuchnia u szefa");
                    System.out.println("Włoskie specjały");
                }
            }
        }

    }
}
