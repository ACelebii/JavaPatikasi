package Pratik22;

public class PalindromSayilar {

    static void isPalindrom(int sayi) {

        int tersSayi = 0, hafiza = sayi;

        while (hafiza != 0) {
            tersSayi = tersSayi + (hafiza % 10);
            hafiza /= 10;
            tersSayi=tersSayi*10;
        }
        tersSayi=tersSayi/10;

        if (sayi == tersSayi) {
            System.out.println(sayi + " Palindrom sayıdır.");
        } else {
            System.out.println(sayi + " Palindrom sayı değildir.");
        }
    }

    public static void main(String[] args) {
        isPalindrom(623326); // Farklı değer denemek için sayıyı değiştirin.
    }
}
