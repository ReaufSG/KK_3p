package lekcja2;

import java.util.Scanner;

public class LiczbyRzymskieNa6 {

    public static String IntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Nieprawidłowa liczba rzymska.";
        StringBuilder s = new StringBuilder();
        while (input >= 1000) {
            s.append("M");
            input -= 1000;        }
        while (input >= 900) {
            s.append("CM");
            input -= 900;
        }
        while (input >= 500) {
            s.append("D");
            input -= 500;
        }
        while (input >= 400) {
            s.append("CD");
            input -= 400;
        }
        while (input >= 100) {
            s.append("C");
            input -= 100;
        }
        while (input >= 90) {
            s.append("XC");
            input -= 90;
        }
        while (input >= 50) {
            s.append("L");
            input -= 50;
        }
        while (input >= 40) {
            s.append("XL");
            input -= 40;
        }
        while (input >= 10) {
            s.append("X");
            input -= 10;
        }
        while (input == 9) {
            s.append("IX");
            input -= 9;
        }
        while (input >= 5) {
            s.append("V");
            input -= 5;
        }
        while (input == 4) {
            s.append("IV");
            input -= 4;
        }
        while (input >= 1) {
            s.append("I");
            input -= 1;
        }
        return s.toString();
    }
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz tryb: 1 - liczba na rzymską, 2 - rzymska na liczbę");
        int tryb = scanner.nextInt();
        scanner.nextLine();
        if (tryb == 1) {

            System.out.println("Podaj liczbę od 1 do 3999: ");
            int liczba = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Liczba rzymska: " + IntegerToRomanNumeral(liczba));

        }
        else if (tryb == 2) {

            int result = 0;
            int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            System.out.println("Podaj liczbę rzymską: ");
            String test = scanner.nextLine();

            boolean valid = test.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
            if(!valid){
                System.out.println("Nieprawidłowa liczba rzymska.");
                return;
            }
            for (int i = 0; i < decimal.length; i++ ) {
                while (test.indexOf(roman[i]) == 0) {
                    result += decimal[i];
                    test = test.substring(roman[i].length());
                }
            }
            if (result < 1 || result > 3999) {
                System.out.println("Nieprawidłowa liczba rzymska.");
            }
            else {
                System.out.println("Liczba: " + result);
            }

        }
}}
