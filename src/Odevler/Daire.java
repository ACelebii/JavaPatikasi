package Odevler;

import java.util.Scanner;

public class Daire {
    public static void main (String[] args) {
        double yarıCap, alan, cevre, pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapı giriniz : ");
        yarıCap = input.nextDouble();

        // Alan ve cevre hesapalnadı
        alan = pi * yarıCap * yarıCap;
        System.out.println("Dairenin alanı : " + alan + "cm\u00B2");

        cevre = 2 * pi * yarıCap;
        System.out.println("Dairenin çevresi : " + cevre + "cm");

        //Daire diliminin alanını bulma

        double merkezAcı, daireDilimAlan;
        System.out.println("Dairenin merkez açısını giriniz : ");
        merkezAcı = input.nextDouble();

        //Daire diliminin alanı hesaplandı
        daireDilimAlan = ( pi * (yarıCap * yarıCap) * merkezAcı)/360;
        System.out.println("Daire diliminin alanı : " + daireDilimAlan + "cm\u00B2");

    }
}
