package Odevler;

import java.util.Scanner;
import java.text.DecimalFormat;

public class UcakBiletiFiyati {
    public static void main(String[] args) {

        // Deişkenler tanımlandı.
        double mesafe, yas, mUcret=0.10, nTutar, yIndirimi=0, iTutar, gdbIndirimi, tTutar;
        int yolTip;

        // Kullanıcıdan değerlerin aldırılması icin scanner kullanıldı.
        // Virgüllerden sonra çıkan 0'ların silinmesi için DecimalFormat eklendi.
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // Kullanıcıdan KM, yaş ve gidiş döneş bilgisi istendi.
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolTip = input.nextInt();

        // Ücret hesaplaması...
        nTutar=mesafe*mUcret;

        // İndirimlerin hesaplanması ve toplam tutara uygulanması...
        if (yas < 12) {
            yIndirimi=nTutar*0.50;
        } else if (yas >=12 && yas <= 24){
            yIndirimi=nTutar*0.10;
        } else if (yas >= 65){
            yIndirimi=nTutar*0.30;
        }

        iTutar=nTutar-yIndirimi;

        switch (yolTip) {
            case 1:
                gdbIndirimi=iTutar*0;
                tTutar=iTutar-gdbIndirimi;
                System.out.print("\nToplam Tutar = " + df.format(tTutar) +" TL");
                break;

            case 2:
                gdbIndirimi=iTutar*0.20;
                tTutar=iTutar-gdbIndirimi;
                tTutar=tTutar*2;
                System.out.print("\nToplam Tutar = " + df.format(tTutar) +" TL");
                break;

            default:
                System.out.println("\nHatalı Veri Girdiniz !");
                break;
        }
    }
}

