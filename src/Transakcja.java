public class Transakcja {
    public static void main(String[] args) {

        int akcje = 1000;
        float cena = 32.87f;
        float prowizja = 0.02f;
        float sprzedaż = 33.92f;
        System.out.println("Kwota zapłacona: " + akcje * cena);
        System.out.printf("Kwota zapłacona brokerowi przy zakupie: %6.2f" , akcje * cena * prowizja);
        System.out.printf("\nKwota otrzymana ze sprzedaży: %6.2f" , akcje * sprzedaż);
        System.out.printf("\nKwota zapłacona brokerowi przy sprzedaży: %6.2f" , akcje * sprzedaż * prowizja);
        System.out.printf("\nKwota otrzymana ze sprzedaży po odjęciu prowizji: %6.2f" , akcje * sprzedaż * (1 - prowizja));
        System.out.printf("\nWartość prowizji: %6.2f" , akcje * cena * prowizja);
        System.out.printf("\nZysk: %6.2f" , (akcje * sprzedaż * (1 - prowizja) - akcje * cena * (1 + prowizja)));

    }
}
