public class Osoba {
    private int id;
    private String imie;
    static int liczbaInstancji;

    public Osoba() {
        this.id = 0;
        this.imie = "";
        liczbaInstancji += 1;
    }

    public Osoba(int id, String imie) {
        this.id = id;
        this.imie = imie;
        liczbaInstancji += 1;
    }
    public Osoba(Osoba other){
        this.id = other.id;
        this.imie = other.imie;
        liczbaInstancji += 1;
    }

    public void wypiszImie(String imieOsoby){
        if(this.imie.isEmpty()){
            System.out.println("Brak danych");
        }else{
            System.out.println("Cześć "+imieOsoby+", mam na imię "+this.imie);
        }
    }


}
