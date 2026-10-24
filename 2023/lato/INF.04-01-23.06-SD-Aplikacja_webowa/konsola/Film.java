/*****************************************************
 nazwa klasy: Film
 pola:
 tytul - przechowuje tytuł filmu
 liczbaWypozyczen - przechowuje liczbę wypożyczeń filmu
 metody:
 getTytul, String - zwraca tytuł filmu
 setTytul, void - ustawia tytuł filmu
 getLiczbaWypozyczen, int - zwraca liczbę wypożyczeń
 inkrementuj, void - zwiększa liczbę wypożyczeń o 1
 informacje:
 Konstruktor Film inicjalizuje tytuł pustym ciągiem,
 a liczbę wypożyczeń wartością 0.
 autor: 000000000
 *****************************************************/

public class Film {
    protected String tytul;
    protected int liczbaWypozyczen;

    public Film() {
        this.tytul = "";
        this.liczbaWypozyczen = 0;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void inkrementuj() {
        this.liczbaWypozyczen += 1;
    }
}
