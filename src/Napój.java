public class Napój {
    public static void main(String[] args) {

        int konsumenci = 12467;
        float energetyk = 0.14f;
        float cytrusowy = 0.64f;
        System.out.printf("Osób pijących napoje energetyczne raz w tygodniu: " + "%6.0f" ,konsumenci * energetyk);
        System.out.printf("\nOsób preferujących cytrusowe smaki napojów energetycznych " + "%6.0f" ,konsumenci * cytrusowy * energetyk);

    }
}
