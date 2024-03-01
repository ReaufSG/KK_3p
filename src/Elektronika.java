import java.util.Scanner;

public class Elektronika {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double marza = 0.4;
        System.out.println("Podaj cenę: ");
        int cena = scanner.nextInt();
        double zysk = cena * marza;
        System.out.println("Zysk:" + zysk);
    }
}
