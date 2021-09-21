package Odevler;

import java.util.Scanner;

public class UsHesabiYapanProgram {

    static int us(int taban, int us) {

        if (us != 0) {
            return taban*us(taban, us-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        int us, taban;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        taban = input.nextByte();

        System.out.print("Üs değeri giriniz: ");
        us = input.nextByte();

        System.out.println("Sonuç: " + us(taban, us)); // Test etmek için sayı değerini değiştirin.

    }
}
