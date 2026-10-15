import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liczba zarejestrowanych osób to "+Osoba.liczbaInstancji);
        Osoba osoba1 = new Osoba();

        Scanner scanner = new Scanner(System.in);
        int id;
        String imie;
        System.out.println("Podaj id osoby: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj imie osoby: ");
        imie = scanner.nextLine();
        Osoba osoba2 = new Osoba(id, imie);
        Osoba osoba3 = new Osoba(osoba2);

        osoba1.wypiszImie("Jan");
        osoba2.wypiszImie("Jan");
        osoba3.wypiszImie("Jan");

        System.out.println("Liczba zarejestrowanych osób to "+Osoba.liczbaInstancji);
    }
}