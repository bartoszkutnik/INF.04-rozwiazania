import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1001);
        }

        System.out.println("Tablica przed posortowaniem:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        sortuj(tab);

        System.out.println("Tablica po posortowaniu:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        boolean czyPosortowana = true;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                czyPosortowana = false;
                break;
            }
        }

        if (czyPosortowana) {
            System.out.println("\nTest zakończony sukcesem: Tablica jest poprawnie posortowana rosnąco.");
        } else {
            System.out.println("\nTest oblany: Tablica NIE JEST posortowana poprawnie.");
        }
    }

    public static void sortuj(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
}