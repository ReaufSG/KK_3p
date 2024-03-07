package lekcja4;


import java.util.Random;
import java.util.Scanner;

public class zad22 {
    public static void main(String[] args) {

        //22. Symulacja automatu do gier
        //Automat do gier to maszyna do gier hazardowych, do której użytkownik wrzuca pieniądze,
        //po czym pociąga za wajchę (lub wciska przycisk). Automat do gier wyświetla
        //następnie losowy zbiór obrazków. Jeśli przynajmniej dwa obrazki są takie same, użytkownik
        //wygrywa określoną kwotę pieniędzy wypłacanych przez maszynę.
        //Utwórz program, który symuluje działanie automatu do gier. Program w trakcie
        //działania powinien wykonywać następujące operacje:
        //Wyświetlać prośbę o podanie kwoty pieniędzy, jaką użytkownik chce wrzucić
        //do maszyny.
        //Zamiast wyświetlać obrazki, losowo wybierać słowa z następującej listy:
        //Wiśnie, Pomarańcze, Śliwki, Dzwonki, Melony, Bary.
        //Aby wybrać słowo, program może generować liczbę losową z przedziału od 0 do 5.
        //Po wylosowaniu liczby 0 program wybierze słowo Wiśnie, liczba 1 to Pomarańcze
        //itd. Program powinien trzy razy losowo wybierać słowo z tej listy i wyświetlać
        //każde z tych trzech słów.
        //Jeśli losowo wybrane słowa nie pasują do siebie, program informuje użytkownika,
        //że wygrał 0 złotych. Jeżeli pasują do siebie dwa słowa, program komunikuje,
        //że użytkownik wygrał dwukrotność postawionej kwoty. Jeśli trzy słowa
        //są identyczne, program wyświetla informację o wygraniu trzykrotności stawki.
        //Program wyświetla pytanie, czy użytkownik chce zagrać ponownie. Jeśli tak,
        //opisane wcześniej kroki są powtarzane. W przeciwnym razie program wyświetla
        //łączną kwotę wrzuconą do automatu i łączną wartość wygranych.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalMoney = 0;
        int totalWin = 0;
        String answer;
        do {
            System.out.println("Podaj kwotę pieniędzy, jaką chcesz wrzucić do automatu: ");
            int money = scanner.nextInt();
            scanner.nextLine();
            String[] arr = {"🍒", "🍊", "🍇", "🔔", "🍈", "🍹"};

            int i = 0;
            int[] wynik = new int[3];
            while (i < 3) {
                int liczba = random.nextInt(6);
                wynik[i] = liczba;
                i++;
            }
            int first = wynik[0];
            int second = wynik[1];
            int third = wynik[2];
            System.out.println(arr[first] + " " + arr[second] + " " + arr[third]);
            boolean ab = arr[first].equals(arr[second]);
            boolean bc = arr[second].equals(arr[third]);
            boolean ac = arr[first].equals(arr[third]);
            if (ab && bc && ac) {
                System.out.println("Wygrałeś trzykrotność postawionej kwoty!");
                totalWin += money * 3;
            } else if (ab || bc || ac) {
                System.out.println("Wygrałeś dwukrotność postawionej kwoty!");
                totalWin += money * 2;
            } else {
                System.out.println("Wygrałeś 0 złotych.");
            }
            totalMoney += money;
            System.out.println("Czy chcesz zagrać ponownie? (tak/nie)");
            answer = scanner.next();
            if (answer.equals("nie")) {
                break;
            }
        } while (answer.equals("tak"));
        System.out.println("Łączna kwota wrzucona do automatu: " + totalMoney);
        System.out.println("Łączna wartość wygranych: " + totalWin);
        if (totalWin > totalMoney) {
            System.out.println("Wygrałeś " + (totalWin - totalMoney) + " złotych!");
        } else if (totalWin < totalMoney) {
            System.out.println("Przegrałeś " + (totalMoney - totalWin) + " złotych!");
        } else {
            System.out.println("Nie wygrałeś ani nie przegrałeś.");
        }

    }

}
