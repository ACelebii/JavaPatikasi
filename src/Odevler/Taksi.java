package Odevler;

import java.util.Scanner;

public class Taksi {
    public static void main (String[] args) {

        double km, katsayı = 2.2, minUcret = 20, acılısUcret = 10, toplamUcret,odenecekUcret;
        Scanner input = new Scanner(System.in);
        System.out.println("Taksimetre uygulaması için km değeri girin : ");
        km = input.nextDouble();

        //toplam ücret hesaplandı km başına olan hesap sorgulatıldı.

        toplamUcret = acılısUcret + ( km * katsayı);
        boolean kosul1 = toplamUcret < 20;
        odenecekUcret = kosul1 ? minUcret : toplamUcret;

        // Hesaplama ekrana basıldı

        System.out.println("Toplam ödenecek Ücret = " + odenecekUcret + "TL");


    }
}
