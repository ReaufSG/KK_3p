package lekcja4;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) throws IOException {

        //23. Generator osobistych stron internetowych
        //Napisz program, który wyświetla prośbę o podanie imienia użytkownika, a następnie
        //o wpisanie opisującego go zdania. Oto przykładowy przebieg programu:
        //Podaj swoje imię: Julia Tracz [Enter]
        //Opisz siebie: Studiuję informatykę, należę do zespołu jazzowego, a po studiach chcę
        //pracować jako programistka aplikacji internetowych. [Enter]
        //Po wprowadzeniu przez użytkownika żądanych danych wejściowych program powinien
        //generować plik HTML z tymi danymi, tworząc w ten sposób prostą stronę internetową.
        //Oto przykładowy kod w HTML-u oparty na pokazanych wcześniej danych
        //wejściowych:
        //<html>
        //<head>
        //</head>
        //<body>
        //<center>
        //<h1>Julia Tracz</h1>
        //</center>
        //<hr />
        //Studiuję informatykę, należę do zespołu jazzowego, a po studiach chcę
        //pracować jako programistka aplikacji internetowych.
        //<hr />
        //</body>
        //</html

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.println("Opisz siebie: ");
        String description = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("index.html");
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<center>");
        writer.println("<h1>" + name + "</h1>");
        writer.println("</center>");
        writer.println("<hr/>");
        writer.println(description);
        writer.println("<hr/>");
        writer.println("</body>");
        writer.println("</html>");
        File htmlFile = new File("index.html");
        Desktop.getDesktop().browse(htmlFile.toURI());
        writer.close();
        fileWriter.close();


    }
}
