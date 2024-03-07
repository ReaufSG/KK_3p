package lekcja4;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class zad14 {
    public static void main(String[] args) throws IOException {

        //14. Numery wierszy
        //Napisz program, który wyświetla prośbę o podanie nazwy pliku. Program powinien
        //wyświetlać zawartość pliku, poprzedzając każdy wiersz jego numerem i dwukropkiem.
        //Numerowanie wierszy zacznij od 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku.");
        String a = scanner.nextLine();
        File file = new File(a);
        Scanner scanner2 = new Scanner(file);
        int i = 1;
        while (scanner2.hasNextLine()) {
            System.out.println(i + ": " + scanner2.nextLine());
            i++;
        }

    }

}
