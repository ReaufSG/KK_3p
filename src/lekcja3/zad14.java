package lekcja3;

public class zad14 {
    public static void main(String[] args) {

        StringBuilder wynik;

        for (int i = 1, a = -1; i <= 6; i++, a++) {

            wynik = new StringBuilder("#");
            for (int j = a; j >= 0; j--) {

                wynik.append(" ");

            }
            wynik.append("#");
            System.out.println(wynik);
        }

    }
}
