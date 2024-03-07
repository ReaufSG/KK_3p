package lekcja4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) throws IOException {

        //13. Wyświetlanie początku pliku
        //Napisz program wyświetlający prośbę o podanie nazwy pliku. Program powinien wyświetlać
        //tylko pięć pierwszych wierszy zawartości pliku. Jeśli plik zawiera mniej niż pięć
        //wierszy, należy wyświetlić zawartość całego pliku.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku.");
        String a = scanner.nextLine();
        File file = new File(a);
        Scanner scanner2 = new Scanner(file);
        int i = 0;
        while (scanner2.hasNextLine() && i < 5) {
            System.out.println(scanner2.nextLine());
            i++;
        }


    }
}
