package lekcja4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) throws IOException {

        //. Licznik liter w pliku
        //Napisz program, który wyświetla prośbę o podanie nazwy pliku, a następnie o wprowadzenie
        //znaku. Program ten powinien zliczać i wyświetlać liczbę wystąpień określonego
        //znaku w pliku. Za pomocą Notatnika lub innego edytora tekstu utwórz prosty
        //plik, który można wykorzystać do przetestowania programu.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku.");
        String a = scanner.nextLine();
        File file = new File(a);
        Scanner scanner2 = new Scanner(file);
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter writer = new PrintWriter(fileWriter);

        System.out.println("Podaj tekst do zapisania w pliku.");
        writer.println(scanner.nextLine());
        System.out.println("Podaj znak.");
        char b = scanner.next().charAt(0);
        scanner.nextLine();
        int wynik = 0;
        while (scanner2.hasNextLine()) {
            String line = scanner2.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == b) {
                    wynik++;
                }
            }
        }
        System.out.println("Liczba wystąpień znaku " + b + " w pliku " + a + " to: ");
        System.out.println(wynik);
        writer.close();
        fileWriter.close();

    }
}
