package Odevler;

import java.util.Scanner;

public class Hipo {
    public static void main (String [] args) {
        //Değişkenler
        double a, b,c;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.println("2.Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c );

        System.out.println("Üçgenin Alanı");
        System.out.println("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.println("2.Kenarı Giriniz : ");
        b = girdi.nextInt();
        System.out.println("3.Kenarı Giriniz : ");
        c = girdi.nextInt();

        double alan ,u;

        u = (a + b + c)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin Alanı : " + alan);

    }
}
