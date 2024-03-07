package lekcja3;

public class zad12 {
    public static void main(String[] args) {

        double wynik = 0;

        for (int i = 1, j = 30; i <= 30; i++,j--) {

            wynik += (double) i / (double) j;

    }
        System.out.println(wynik);
    }
}
