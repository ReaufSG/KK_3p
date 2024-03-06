import java.util.Scanner;
public class MasaCiężar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj masę: ");
        double masa = scanner.nextDouble();
        scanner.nextLine();
        double ciężar = masa * 9.8;

        System.out.println("Ciężar wynosi: " + ciężar + " N");

        if(ciężar < 10 && ciężar > 0){
            System.out.println("Obiekt jest za lekki");
        } else if(ciężar >= 10 && ciężar < 1000){
            System.out.println("Obiekt jest w normie");
        } else if(ciężar >= 1000){
            System.out.println("Obiekt jest zbyt ciężki");
        } else {
            System.out.println("Błąd");
        }

    }
}
