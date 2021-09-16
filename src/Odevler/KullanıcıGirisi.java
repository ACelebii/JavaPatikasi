package Odevler;

import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main (String[] args) {
        String userName, passWord;
        char sifreCevap;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kullanıcı adı ve şifre istenir.
        System.out.println("Lütfen kullanıcı adını giriniz : ");
        userName = input.nextLine();

        System.out.println("Lütfen şifrenizi giriniz : ");
        passWord = input.nextLine();

        //Alınan bilgilerin kontrolü ve hatalı işlem kontrolü
        if (userName.equals("patika")) {
            if (passWord.equals("dev")) {
                System.out.println("Sisteme başarılı bir şekilde giriş yapıldı.");
            } else {
                System.out.println("Hatalı şifre girişi !!!");
                System.out.println("Şifrenizi sıfırlamak ister misiniz? E/H : ");
                sifreCevap = input.next().charAt(0);

                if (sifreCevap == 'E') {

                    System.out.println("Lütfen yeni şifrenizi giriniz: ");
                    // Eğer String newPassword = input.nextLine(); olarak yazılmış olsaydı sistem bu kodu atlayacaktı.
                    // Bu nedenle input.next(); olarak alındı.
                    String newPassword = input.next();

                    if (newPassword.equals(passWord) || newPassword.equals("dev")) {
                        System.out.println("Şifre oluşturulamadı.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                } else if (sifreCevap == 'H') {
                    System.out.println("Şifre oluşturma işlemi iptal edildi..");
                } else {
                    System.out.println("Lütfen geçerli bir parametre giriniz. E (Evet) veya H (Hayır) !!!");
                }
            }
        } else {
            System.out.println("Hatalı kullanıcı adı girişi !!!");
        }
    }

    }
