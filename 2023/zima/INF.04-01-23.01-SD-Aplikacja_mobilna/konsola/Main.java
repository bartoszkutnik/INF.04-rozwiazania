import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tytul1;
        String tresc1;
        String tytul2;
        String tresc2;

        System.out.println("Podaj dwie notatki:");
        System.out.println("Notatka 1");
        System.out.print("Tytuł: ");
        tytul1 = scanner.nextLine();

        System.out.print("Treść: ");
        tresc1 = scanner.nextLine();

        System.out.println("Notatka 2");
        System.out.print("Tytuł: ");
        tytul2 = scanner.nextLine();

        System.out.print("Treść: ");
        tresc2 = scanner.nextLine();


        Notatka notatka1 = new Notatka(tytul1, tresc1);
        notatka1.wyswietlTytulITresc();
        notatka1.wypiszWartosciPol();

        Notatka notatka2 = new Notatka(tytul2, tytul2);
        notatka2.wyswietlTytulITresc();
        notatka2.wypiszWartosciPol();
    }
}