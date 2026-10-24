public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        System.out.println("Obiekt film: tytuł: " + film.getTytul() + ", liczba wypożyczeń: " + film.getLiczbaWypozyczen());

        film.setTytul("Gwiezdne Wojny");
        System.out.println("Obiekt film: tytuł: " + film.getTytul());
        System.out.println("Przed inkrementacją liczby wypożyczeń: " + film.getLiczbaWypozyczen());
        film.inkrementuj();
        System.out.println("Po inkrementacji liczby wypożyczeń: " + film.getLiczbaWypozyczen());
    }
}