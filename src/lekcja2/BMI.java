package lekcja2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double wzrost = scanner.nextDouble();
        scanner.nextLine();
        double waga = scanner.nextDouble();
        scanner.nextLine();
        double bmi = waga / (wzrost * wzrost);
        if(bmi < 18.5){
            System.out.println("Niedowaga");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Waga prawidłowa");
        } else if(bmi >= 25 && bmi < 30){
            System.out.println("Nadwaga");
        }

    }
}
