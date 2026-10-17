import java.util.Scanner;

public class Sortowanie {
    private int[] tab = new int[10];


/********************************************************
* nazwa funkcji: szukajNajwyzszyIndeks
* parametry wejściowe: int poczatek - przechowuje indeks od ktorego ma być zaczęty szukany najwyzszy indeks
* wartość zwracana: najwyzszyIndeks - indeks liczby ktora jest najwieksza w zakresie od poczatek do koniec (tab.length)
* autor: 00000000000
* ****************************************************/
    private int szukajNajwyzszyIndeks(int poczatek){
        int koniec = tab.length;
        int najwyzszyIndeks = poczatek;

        for (int i = poczatek; i < koniec; i++) {
            if(tab[najwyzszyIndeks] < tab[i]){
                najwyzszyIndeks = i;
            }
        }
        return najwyzszyIndeks;
    }

/********************************************************
* nazwa funkcji: sortujPrzezWybieranie
* parametry wejściowe: brak
* wartość zwracana: brak
* autor: 00000000000
* ****************************************************/
    public void sortujPrzezWybieranie(){
        int poczatek = 0;
        int koniec = tab.length;

        while(poczatek < koniec){
            int najwyzszyIndeks = szukajNajwyzszyIndeks(poczatek);
            int temp = tab[poczatek];
            tab[poczatek] = tab[najwyzszyIndeks];
            tab[najwyzszyIndeks] = temp;

            poczatek += 1;
        }
    }
    public void wczytajDaneDoTablicy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb do posortowania: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }
    }
    public void wypiszDaneTablicy(){
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+", ");
        }
    }
}
