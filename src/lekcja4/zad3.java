package lekcja4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws IOException {
        //3. Plik z odległością
        //Zmodyfikuj program z zadania programistycznego 2. („Przebyta odległość”) w taki
        //sposób, aby zapisywał dane w pliku, a nie na ekranie. Otwórz uzyskany plik w Notatniku
        //lub innym edytorze tekstu, aby potwierdzić poprawność danych wyjściowych

        FileWriter fileWriter = new FileWriter("odległość.txt");
        PrintWriter writer = new PrintWriter(fileWriter);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj prędkość pojazdu (w km/h) oraz czas podróży (w godzinach)");
        int speed = scanner.nextInt(), time = scanner.nextInt();
        for (int i = 1; i <= time; i++) {
            writer.println(i + " godzina: " + speed*i + " km");
        }
        writer.close();
        fileWriter.close();
    }
}
