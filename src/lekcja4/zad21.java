package lekcja4;

import java.util.Random;

public class zad21 {
    public static void main(String[] args) {

        //21. Gra w kości
        //Napisz program do prostej gry w kości między komputerem a użytkownikiem. Po
        //uruchomieniu program powinien wykonywać pętlę 10 razy. W każdej iteracji pętli
        //należy wykonać następujące operacje:
        //Wygenerować liczbę losową z przedziału od 1 do 6. Jest to wartość rzutu
        //komputera.
        //Wygenerować inną liczbę losową z przedziału od 1 do 6. Jest to wartość rzutu
        //użytkownika.
        //Wyższa liczba oczek daje wygraną. W przypadku równej liczby oczek dla danego
        //rzutu nie ma zwycięzcy.
        //W kolejnych iteracjach program powinien zachowywać liczbę wygranych komputera
        //i użytkownika. Po wykonaniu wszystkich iteracji program ma wyświetlać, kto wygrał
        //całą grę: komputer czy użytkownik

        Random random = new Random();
        int computerWins = 0;
        int userWins = 0;
        for (int i = 0; i < 10; i++) {
            int computer = random.nextInt(6) + 1;
            int user = random.nextInt(6) + 1;
            System.out.println("Komputer: " + computer + " Użytkownik: " + user);
            if (computer > user) {
                computerWins++;
            } else if (user > computer) {
                userWins++;
            }

        }
        if (computerWins > userWins) {
            System.out.println("Komputer wygrał!");
        } else if (userWins > computerWins) {
            System.out.println("Użytkownik wygrał!");
        } else {
            System.out.println("Remis!");
        }


    }
}
