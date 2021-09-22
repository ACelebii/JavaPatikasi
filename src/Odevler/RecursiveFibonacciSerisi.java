package Pratik23;

public class RecursiveFibonacciSerisi {

    static int fbncc(int sayi) {

        if (sayi == 1 || sayi == 2) {
            return 1;
        }
        return fbncc(sayi - 1) + fbncc(sayi - 2);
    }

    public static void main(String[] args) {

        System.out.println(fbncc(6)); // Test etmek için sayı değerini değiştirin.
    }
}

