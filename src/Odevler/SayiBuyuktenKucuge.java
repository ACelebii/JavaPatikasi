package Odevler;

import java.util.Scanner;

public class SayiBuyuktenKucuge {
    public static void main(String[] args) {

        //Sayılar için değişlenler oluşturuldu.
        int s1, s2, s3;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı değerleri istendi.
        System.out.print("Lütfen 1. Sayıyı giriniz : ");
        s1 = input.nextInt();

        System.out.print("Lütfen 2. Sayıyı giriniz : ");
        s2 = input.nextInt();

        System.out.print("Lütfen 3. Sayıyı giriniz : ");
        s3 = input.nextInt();

        // BÜYÜKTEN KÜÇÜĞE SIRALAMA
        System.out.println("!!! BÜYÜKTEN KÜÇÜĞE SIRALAMA !!!");

        // Alınan değerler kıyaslanarak yazdırıldı.
        if (s1 > s2 && s1 > s3) {
            if (s2 > s3) {
                System.out.println("s1>s2>s3");
            } else {
                System.out.println("s1>s3>s2");
            }
        } else if (s2 > s1 && s2 > s3) {
            if (s1 > s3) {
                System.out.println("s2>s1>s3");
            } else {
                System.out.println("s2>s3>s1");
            }
        } else {
            if (s1 > s2) {
                System.out.println("s3>s1>s2");
            } else {
                System.out.println("s3>s2>s1");
            }
        }

        // KÜÇÜKTEN BÜYÜĞE SIRALAMA
        System.out.println("\n!!! KÜÇÜKTEN BÜYÜĞE SIRALAMA !!!");

        if (s1 < s2 && s1 < s3) {
            if (s2 < s3) {
                System.out.println("s1<s2<s3");
            } else {
                System.out.println("s1<s3<s2");
            }
        } else if (s2 < s1 && s2 < s3) {
            if (s1 < s3) {
                System.out.println("s2<s1<s3");
            } else {
                System.out.println("s2<s3<s1");
            }
        } else {
            if (s1 < s2) {
                System.out.println("s3<s1<s2");
            } else {
                System.out.println("s3<s2<s1");
            }
        }
    }
}

