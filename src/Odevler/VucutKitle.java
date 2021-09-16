package Odevler;

import java.util.Scanner;

public class VucutKitle {
    public static void main (String[] args) {
        double boy, kilo, kıtleIndeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu(metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        kıtleIndeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kıtleIndeks);
    }

    }
