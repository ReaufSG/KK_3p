package lekcja3;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        int product = 0;
        Scanner scanner = new Scanner(System.in);

        while (product < 100) {
            product = scanner.nextInt() * 10;
        }
        System.out.println(product);
    }

}
