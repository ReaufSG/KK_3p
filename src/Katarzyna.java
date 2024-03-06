public class Katarzyna {
    public static void main(String[] args) {

        int akcje = 600;
        float cena = 21.77f;
        float prowizja = 0.02f;
        System.out.println("Kwota bez prowizji: " + akcje * cena);
        System.out.println("Prowizja: " + akcje * cena * prowizja);
        System.out.println("Kwota z prowizją: " + akcje * cena * (1 + prowizja));

    }
}
