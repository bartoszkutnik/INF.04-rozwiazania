import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[51];
        wypelnijTablice(tab);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do znalezienia w tablicy: ");
        int szukana = scanner.nextInt();

        tab[50] = szukana;

        int znalezionyIndeks = przeszukajTablice(tab, szukana);
        wypiszTablice(tab);
        System.out.println();

        if (znalezionyIndeks == -1) {
            System.out.println("Nie znaleziono liczby " + szukana + " w tablicy");
        } else {
            System.out.println("Liczba " + szukana + " została odnaleziona pod indeksem " + znalezionyIndeks);
        }
    }
    public static void wypelnijTablice(int[] tab) {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            tab[i] = random.nextInt(100) + 1;
        }
    }

    public static void wypiszTablice(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");
        }
    }

//   *********************************************
//    nazwa funkcji: przeszukajTablice
//    argument: int[] tab - przechowuje tablice typu liczbowego ktora bedzie przeszukiwana w celu znalezienia szukanej liczby
//    int szukana - przechowuje liczbe ktora jest szukana liczba w tablicy
//    typ zwracany: int, zwracany jest indeks znalezionej szukanej liczby lub -1 jesli nie znaleziono
//    informacje: brak
//    autor: Bartosz Kutnik
//  *********************************************
    public static int przeszukajTablice(int[] tab, int szukana) {
        int i = 0;
        while (tab[i] != szukana) {
            i++;
        }
        if (i == tab.length - 1) {
            return -1;
        }
        return i;
    }
}