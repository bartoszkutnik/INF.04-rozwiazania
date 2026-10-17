//**********************************************
//klasa: Notatka
//opis: klasa reprezentuje pojedynczą notatke ktora przechowuje jej id, tytul, tresc oraz liczbe wszystkich utworzonych notatek.
//pola:   private static int licznikNotatek - przechowuje liczbe utworzonych instancji klasy Notatka. Pole jest dostępne wyłącznie w klasie.
//        private int id - przechowuje numer identyfikatora klasy
//        protected String tytul - przechowuje tytul notatki. Dostepna w obrebie klasy i klasach potomnych
//        protected String tresc - przechowuje tresc notatki. Dostepna w obrebie klasy i klasach potomnych
//autor: 0000000000000
//************************************************
public class Notatka {
    private static int licznikNotatek;
    private int id;
    protected String tytul;
    protected String tresc;

    public Notatka(String tytul, String tresc) {
        licznikNotatek += 1;
        this.id = licznikNotatek;
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public void wyswietlTytulITresc(){
        System.out.println("Tytuł notatki: "+this.tytul+", treść: "+this.tresc);
    }
    public void wypiszWartosciPol(){
        System.out.println(licznikNotatek+";"+id+";"+tytul+";"+tresc);
    }
}
