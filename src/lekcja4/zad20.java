package lekcja4;

import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {

        //20. Wyświetlanie kwadratu
        //Napisz program, który wyświetla użytkownikowi prośbę o podanie dodatniej liczby
        //całkowitej nie większej niż 15. Program powinien następnie wyświetlać na ekranie
        //kwadrat ze znaków „X”. Liczba podana przez użytkownika określa długość każdego
        //boku kwadratu. Na przykład jeśli użytkownik wpisał 5, program powinien wyświetlić
        //następujący wzór:
        //XXXXX
        //XXXXX
        //XXXXX
        //XXXXX
        //XXXXX
        //Po wpisaniu przez użytkownika 8 program powinien wyświetlać następujące znaki:
        //XXXXXXXX
        //XXXXXXXX
        //XXXXXXXX
        //XXXXXXXX
        //XXXXXXXX
        //XXXXXXXX
        //XXXXXXXX
        //XXXXXXXX

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą nie większą niż 15.");
        int a = scanner.nextInt();
        while (a > 15 || a < 1) {
            System.out.println("Podaj dodatnią liczbę całkowitą nie większą niż 15.");
            a = scanner.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("X");
            }
            System.out.println();
        }



    }
}
