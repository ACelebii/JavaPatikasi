package Odevler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main (String[] args) {
        double sayi1, sayi2, sonuc;
        char islem;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan giriş istendi.
        System.out.println("1. Sayıyı giriniz : ");
        sayi1 = input.nextDouble();

        System.out.println("2. Sayıyı giriniz : ");
        sayi2 = input.nextDouble();


        System.out.println("+ ( Toplama )");
        System.out.println("- ( Çıkarma )");
        System.out.println("* ( Çarpma )");
        System.out.println("/ ( Bölme )");
        System.out.println("Yapmak istediğniz işlem için ilgili işareti giriniz. ");

        //Değişken atandı
        islem = input.next().charAt(0);

        //Switch-case yapısı kullanıldı.
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama sonucu = " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkarma sonucu = " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpma sonucu = " + sonuc);
                break;
            case '/':
                if (sayi2 == 0){
                    System.out.println("Bir sayı sıfıra bölünmez");
                    break; }
                else {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Bölme sonucu = " + sonuc);
                    break;
                }
            default:
                System.out.println("Lütfen +, -, * veya / işlemlerden birini seçiniz.");
                break;
        }

    }

    }
