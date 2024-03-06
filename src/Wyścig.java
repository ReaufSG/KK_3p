import java.util.Arrays;
import java.util.Scanner;

public class Wyścig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] biegacze = new String[3];
        int[] czasy = new int[3];



        for (int i = 0; i < biegacze.length; i++) {
            System.out.println("Podaj imię biegacza: ");
            biegacze[i] = scanner.nextLine();
            System.out.println("Podaj czas biegacza: ");
            czasy[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int[] czasyKopia = Arrays.copyOf(czasy, czasy.length);
        Arrays.sort(czasyKopia);
        for (int i = 0; i < czasy.length; i++) {
            if(czasy[i] == czasyKopia[0]){
                System.out.println("Zwycięzca: " + biegacze[i] + " czas: " + czasy[i]);

            }
            else if (czasy[i] == czasyKopia[1]){
                System.out.println("Drugie miejsce: " + biegacze[i] + " czas: " + czasy[i]);
            }
            else if (czasy[i] == czasyKopia[2]){
                System.out.println("Trzecie miejsce: " + biegacze[i] + " czas: " + czasy[i]);
            }
        }

    }
}
