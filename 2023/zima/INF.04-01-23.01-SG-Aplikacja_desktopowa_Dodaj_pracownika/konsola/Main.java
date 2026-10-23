import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Program szukający najwięszego wspólnego dzielnika dwóch liczb całkowitych dodatnich");
        System.out.print("Podaj liczbę a: ");
        a = scanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        b = scanner.nextInt();

        System.out.println("Największy wspólny dzielnik liczb " + a + " i " + b + " wynosi: " + program.NWD(a, b));
    }

    //    **********************************************
//    nazwa funkcji: NWD
//    opis funkcji: funkcja szuka i zwraca największy wspólny dzielnik dwóch liczb całkowitych dodatnich używając algorytmu Euklidesa.
//    parametry: int a – pierwsza liczba całkowita dodatnia
//    int b - druga liczba całkowita dodatnia
//    zwracany typ i opis: int a - zostaje zwrócony największy wspólny dzielnik.
//    autor: 000000000
//    ***********************************************
    public int NWD(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Liczby muszą być dodatnie");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}