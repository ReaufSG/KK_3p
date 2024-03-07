package lekcja3;

public class zad13v2 {
    public static void main(String[] args) {

        StringBuilder wynik;

        for (int i = 1, b = 7; i <= 7; i++, b--) {
            wynik = new StringBuilder();
            for (int j = b; j >= 1; j--) {

                wynik.append("*");

            }
            System.out.println(wynik);
        }

    }
}
