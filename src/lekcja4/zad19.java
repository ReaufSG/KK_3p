package lekcja4;

import java.util.Random;
import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {

        //19. Badanie postrzegania pozazmysłowego
        //Napisz program, który bada Twoje zdolności pozazmysłowe. Program powinien losowo
        //wybierać jedną z poniższych nazw kolorów:
        //Czerwony, Zielony, Niebieski, Pomarańczowy, Żółty
        //Na potrzeby wyboru słowa program może generować liczby losowe. Na przykład
        //liczba 0 może odpowiadać słowu Czerwony, a liczba 1 — słowu Zielony.
        //Następnie program powinien wyświetlać prośbę o podanie koloru wybranego przez
        //komputer. Po podaniu koloru przez użytkownika program powinien wyświetlać nazwę
        //losowo wybranej barwy. Program powinien powtarzać ten proces 10 razy, a następnie
        //wyświetlać liczbę poprawnych wskazań użytkownika.

        Scanner scanner = new Scanner(System.in);
        String[] colors = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        Random random = new Random();
        int correct = 0;
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(5);
            System.out.println("Podaj kolor: ");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(colors[number])) {
                correct++;

            }
            System.out.println("To był kolor: " + colors[number]);
        }
        System.out.println("Liczba poprawnych odpowiedzi: " + correct);


    }
}
