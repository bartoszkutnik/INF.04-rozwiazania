import java.util.Scanner;

public class Sortowanie {
    private static int[] tab = new int[10];

    public static void main(String[] args) {
        wczytajLiczby();
        sortujPrzezWybieranie();
        wyswietlPosortowane();
    }

    private static int szukajNajwyzszej(int poczatek, int koniec) {
        int najwyzszyIndeks = poczatek;

        for (int i = poczatek; i < koniec; i++) {
            if (tab[i] > tab[najwyzszyIndeks]) {
                najwyzszyIndeks = i;
            }
        }
        return najwyzszyIndeks;
    }

    public static void sortujPrzezWybieranie() {
        int poczatek = 0;
        int koniec = tab.length;

        while (poczatek < koniec) {
            int indeksNajwyzszej = szukajNajwyzszej(poczatek, koniec);

            int temp = tab[poczatek];
            tab[poczatek] = tab[indeksNajwyzszej];
            tab[indeksNajwyzszej] = temp;

            poczatek += 1;
        }
    }
    public static void wczytajLiczby() {
        System.out.println("Podaj 10 liczb całkowitych do tablicy: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }
    }

    public static void wyswietlPosortowane() {
        System.out.println("Posortowana tablica (malejąco):");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }
}