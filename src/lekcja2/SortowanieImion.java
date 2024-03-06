package lekcja2;

import java.util.Arrays;
import java.util.Scanner;

public class SortowanieImion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imiona: ");
        String[] imiona = new String[3];
        for (int i = 0; i < imiona.length; i++) {
            imiona[i] = scanner.nextLine();
        }
        Arrays.stream(imiona).sorted().forEach(System.out::println);

    }
}
