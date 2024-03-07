package lekcja4;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class zad15 {
    public static void main(String[] args) throws IOException {

        //15. Przekształcanie małych liter w pliku na wielkie
        //Napisz program, który wyświetla prośbę o podanie dwóch plików. Pierwszy plik należy
        //otwierać do odczytu, a drugi do zapisu. Program powinien wczytywać zawartość pierwszego
        //pliku, zmieniać wszystkie znaki na wielkie i zapisywać wynik w drugim pliku.
        //Drugi plik ma być kopią pierwszego, przy czym wszystkie litery w nim mają być wielkie.
        //Za pomocą Notatnika lub innego edytora tekstu utwórz prosty plik, który może posłużyć
        //do przetestowania tego programu

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytu.");
        String a = scanner.nextLine();
        File file = new File(a);
        Scanner scanner2 = new Scanner(file);
        System.out.println("Podaj nazwę pliku do zapisu.");
        String b = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(b);
        PrintWriter writer = new PrintWriter(fileWriter);
        while (scanner2.hasNextLine()) {
            String line = scanner2.nextLine();
            writer.println(line.toUpperCase());
        }
        writer.close();
        fileWriter.close();


    }
}
