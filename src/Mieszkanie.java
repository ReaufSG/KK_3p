
public class Mieszkanie {
    public static void main(String[] args) {

        int pom1x = 3;
        int pom2x = 3;
        int pom3x = 2;
        int pom4x = 2;

        int pom1y = 4;
        int pom2y = 4;
        int pom3y = 3;
        int pom4y = 2;

        int osoby = 4;

        System.out.println("Mieszkanie składa się z 4 pokoi:");
        System.out.println("Pokój 1: " + (pom1x * pom1y));
        System.out.println("Pokój 2: " + (pom2x * pom2y));
        System.out.println("Pokój 3: " + (pom3x * pom3y));
        System.out.println("Pokój 4: " + (pom4x * pom4y));
        System.out.println("Całkowita powierzchnia mieszkania: " + ((pom1x * pom1y) + (pom2x * pom2y) + (pom3x * pom3y) + (pom4x * pom4y)));
        System.out.println("Średnia powierzchnia na osobę: " + ((pom1x * pom1y + pom2x * pom2y + pom3x * pom3y + pom4x * pom4y) / osoby));
    }
}
