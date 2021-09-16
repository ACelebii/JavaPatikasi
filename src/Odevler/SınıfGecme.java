package Pratik8;

import java.util.Scanner;

public class SınıfGecme {

    public static void main(String[] args) {

        /* Her bir ders için değişkenler tanımlandı. Ortalamanın düzgün bir şekilde bölümü için dersSayisi değişkeni
         *  önceden değeri 5 ders olacak şekilde atandı.*/

        int matematik, fizik, turkce, kimya, muzik, dersSayisi = 5;
        double ortalama;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan ders notları istendi.
        System.out.print("Lütfen matematik notunuzu giriniz : ");
        matematik = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        /* Girilen değerlerin 0'dan küçük veya 100'den büyük olma ihtimali kıyaslandı.Eğer koşullar doğru ise
         *  dersSayisi 1 eksiltilerek ilgili ders ortalama hesabından çıkarıldı.*/
        if (matematik < 0 || matematik > 100) {
            matematik = 0;
            dersSayisi--;
        }

        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            dersSayisi--;
        }

        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            dersSayisi--;
        }

        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            dersSayisi--;
        }

        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            dersSayisi--;
        }

        // Ortalama hesabının yapılması ve sonucun ekrana bastırılması.
        ortalama = (matematik + fizik + turkce + kimya + muzik) / dersSayisi;

        if (ortalama >= 55 && ortalama <= 100) {
            System.out.print("Geçtiniz :) Ortalamanız = " + ortalama);
        } else if (ortalama < 55 && ortalama >= 0) {
            System.out.print("Kaldınız :( Ortalamanız = " + ortalama);
        }
    }
}