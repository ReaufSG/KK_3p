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
        System.out.println("Podaj kolor tła: ");
        String color = scanner.nextLine();
        System.out.println("Podaj kolor czcionki: ");
        String fontColor = scanner.nextLine();
        System.out.println("Podaj kolor nagłówka: ");
        String headerColor = scanner.nextLine();


        FileWriter fileWriter = new FileWriter("index.html");
        PrintWriter writer = new PrintWriter(fileWriter);

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styl.css\">");
        writer.println("<script defer src=\"skrypt.js\"></script>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<center>");
        writer.println("<h1>" + name + "</h1>");
        writer.println("<span class=\"website-counter\">To Twoja pierwsza wizyta na naszej stronie!</span>");
        writer.println("</center>");
        writer.println("<hr/>");
        writer.println("<p>" + description + "</p>");
        writer.println("<hr/>");
        writer.println("<button onclick=\"window.location.href='styl.css'\">Styl</button>");
        writer.println("<button onclick=\"window.location.href='skrypt.js'\">Skrypt</button>");
        writer.println("<button onclick=\"al()\">Klik!</button>");
        writer.println("<button id=\"reset\">Reset</button>");
        writer.println("</body>");
        writer.println("</html>");


        FileWriter fileWriter2 = new FileWriter("styl.css");
        PrintWriter writer2 = new PrintWriter(fileWriter2);

        writer2.println("body {background-color: " + color + ";}");
        writer2.println("h1 {color: " + headerColor + ";}");
        writer2.println("p {color: " + fontColor + ";}");

        writer2.close();
        fileWriter2.close();


        FileWriter fileWriter3 = new FileWriter("skrypt.js");
        PrintWriter writer3 = new PrintWriter(fileWriter3);

        writer3.println("function al() {");
        writer3.println("alert(\"Hello! I am an alert box!\");");
        writer3.println("}");

        //var counterContainer = document.querySelector(".website-counter");
        //var resetButton = document.querySelector("#reset");
        //var visitCount = localStorage.getItem("page_view");
        //
        //// Check if page_view entry is present
        //if (visitCount) {
        //  visitCount = Number(visitCount) + 1;
        //  localStorage.setItem("page_view", visitCount);
        //} else {
        //  visitCount = 1;
        //  localStorage.setItem("page_view", 1);
        //}
        //counterContainer.innerHTML = visitCount;
        //
        //// Adding onClick event listener
        //resetButton.addEventListener("click", () => {
        //  visitCount = 1;
        //  localStorage.setItem("page_view", 1);
        //  counterContainer.innerHTML = visitCount;
        //});
        writer3.println("var counterContainer = document.querySelector(\".website-counter\");");
        writer3.println("var resetButton = document.querySelector(\"#reset\");");
        writer3.println("var visitCount = localStorage.getItem(\"page_view\");");
        writer3.println("if (visitCount) {");
        writer3.println("visitCount = Number(visitCount) + 1;");
        writer3.println("localStorage.setItem(\"page_view\", visitCount);");
        writer3.println("} else {");
        writer3.println("visitCount = 1;");
        writer3.println("localStorage.setItem(\"page_view\", 1);");
        writer3.println("}");
        writer3.println("counterContainer.innerHTML = \"To Twoja: \" +visitCount+ \" wizyta na naszej stronie!\";");
        writer3.println("resetButton.addEventListener(\"click\", () => {");
        writer3.println("visitCount = 1;");
        writer3.println("localStorage.setItem(\"page_view\", 1);");
        writer3.println("counterContainer.innerHTML = \"To Twoja pierwsza wizyta na naszej stronie!\";");
        writer3.println("});");
        writer3.close();
        fileWriter3.close();

        writer.close();
        fileWriter.close();
        File htmlFile = new File("index.html");
        Desktop.getDesktop().browse(htmlFile.toURI());


    }
}
