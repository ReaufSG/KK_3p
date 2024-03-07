package lekcja4;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {

        //12. Wykres słupkowy
        //Napisz program, który wyświetla prośbę o podanie wartości sprzedaży z danego dnia
        //z pięciu sklepów. Program powinien wyświetlać wykres słupkowy z porównaniem
        //sprzedaży w każdym ze sklepów. Słupki twórz, wyświetlając wiersze gwiazdek. Każda
        //gwiazdka reprezentuje 100 złotych. Oto przykładowe dane wyjściowe programu:
        //Podaj dzisiejszą wartość sprzedaży dla sklepu nr 1: 1000 [Enter]
        //Podaj dzisiejszą wartość sprzedaży dla sklepu nr 2: 1200 [Enter]
        //Podaj dzisiejszą wartość sprzedaży dla sklepu nr 3: 1800 [Enter]
        //Podaj dzisiejszą wartość sprzedaży dla sklepu nr 4: 800 [Enter]
        //Podaj dzisiejszą wartość sprzedaży dla sklepu nr 5: 1900 [Enter]
        //WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY
        //Sklep nr 1: **********
        //Sklep nr 2: ************
        //Sklep nr 3: ******************
        //Sklep nr 4: ********
        //Sklep nr 5: ******************

        Scanner scanner = new Scanner(System.in);
        int[] sales = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr " + (i + 1));
            sales[i] = scanner.nextInt();
        }
        System.out.println("WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sklep nr " + (i + 1) + ": ");
            for (int j = 0; j < sales[i] / 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
