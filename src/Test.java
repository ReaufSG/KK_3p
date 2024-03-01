import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik 1 testu: ");
        int test1 = scanner.nextInt();
        System.out.println("Podaj wynik 2 testu: ");
        int test2 = scanner.nextInt();
        System.out.println("Podaj wynik 3 testu: ");
        int test3 = scanner.nextInt();
        System.out.println("1 test:" + test1 + "\n2 test:" + test2 + "\n3 test:" + test3 + "\nŚrednia: " + (double) (test1 + test2 + test3) / 3);

    }
}
