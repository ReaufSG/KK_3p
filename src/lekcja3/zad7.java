package lekcja3;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        for (int i = 1; i <= 7; i++) {
            a += scanner.nextInt();
        }
        System.out.println(a);
    }

}
