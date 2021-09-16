package Odevler;

import java.util.Scanner;

public class HavaSicakligiEtkinlikOnerme {
    public static void main(String[] args) {

        // IF İLE ÇÖZÜM
        System.out.println("\n!!! IF İLE ÇÖZÜM !!!\n");

        // Değişkenlerin tanımlanması ve kullanıcıdan sıcaklık değerinin aldırılması.
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen sıcaklık değerini giriniz : ");
        sicaklik = input.nextInt();

        // Koşulların sorgulanarak ekrana yazdırılması.
        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik == 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

        // BOOLEAN İLE ÇÖZÜM
        System.out.println("\n!!! BOOLEAN İLE ÇÖZÜM !!!\n");

        System.out.print("lütfen sıcaklık değerini giriniz : ");
        sicaklik = input.nextInt();
        String sonuc;

        // Sıcaklık 25 derece ve üstü ise kosul5 olsaydı eğer her zaman doğru çıkacaktı.
        // Bu nedenle aşağıdaki sorgulamanın son bölümünde kullanıldı.
        boolean kosul1 = sicaklik < 5; // Kayak
        boolean kosul2 = sicaklik >= 5 && sicaklik < 15; // Sinema
        boolean kosul3 = sicaklik == 15; // Sineme ve Piknik
        boolean kosul4 = (sicaklik > 15 && sicaklik <= 25); // Piknik

        // Koşulların sorgulanması.
        sonuc = kosul1 ? "Kayak yapabilirsiniz." :
                kosul2 ? "Sinemaya gidebilirsiniz." :
                        kosul3 ? "Sinemaya gidebilirsiniz. " + "\nPikniğe gidebilirsiniz." :
                                kosul4 ? "Pikniğe gidebilirsiniz." :
                                        "Yüzmeye gidebilirsiniz.";

        // Sonucun yazdırılması.
        System.out.println(sonuc);

    }
}