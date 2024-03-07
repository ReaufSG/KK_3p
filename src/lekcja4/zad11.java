package lekcja4;

public class zad11 {
    public static void main(String[] args) {

        //11. Tabela przeliczająca stopnie Celsjusza na stopnie Fahrenheita
        //Napisz program, który wyświetla tabelę z temperaturami w stopniach Celsjusza (od 0
        //do 20) i ich odpowiednikami w stopniach Fahrenheita. Oto wzór na przekształcanie
        //temperatury ze stopni Celsjusza na stopnie Fahrenheita:
        //W tym wzorze F to temperatura w stopniach Fahrenheita, a C to temperatura w stopniach
        //Celsjusza. Program ma wyświetlać tabelę z temperaturami za pomocą pętli.

        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + "\t" + (i * 9 / 5 + 32));
        }


    }
}
