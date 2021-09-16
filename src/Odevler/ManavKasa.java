package Odevler;

import java.util.Scanner;

public class ManavKasa {
    public static void main (String[] args) {
        double armutKg= 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5, armut, elma, domates, muz, patlican, toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        armut = input.nextFloat();
        System.out.println("Elma Kaç Kilo ? : ");
        elma = input.nextFloat();
        System.out.println("Domates Kaç Kilo ? : ");
        domates = input.nextFloat();
        System.out.println("Muz Kaç Kilo ? : ");
        muz = input.nextFloat();
        System.out.println("Patlican Kaç Kilo ? : ");
        patlican = input.nextFloat();

        // Toplam tutar hesaplandı.
        toplamTutar = (armut * armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg);
        System.out.println("Toplam Tutar : " + toplamTutar + "TL");

    }

    }
