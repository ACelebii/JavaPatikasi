package ODevler;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        // Değişkenler oluşturuldu kullanıcıdan gün ve ay bilgisi istendi.
        int ay, gun;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğdunuz ? : ");
        ay = input.nextInt();

        System.out.print("Ayın kaçında doğdunuz ? : ");
        gun = input.nextInt();


        // SWTICH-CASE İLE ÇÖZÜM
        System.out.print("!!! SWITCH-CASE İLE ÇÖZÜM !!!\n");

        switch (ay){
            case 1:
                if(gun>=22){
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
                break;

            case 2:
                if(gun>=20){
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
                break;

            case 3:
                if(gun>=21){
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
                break;

            case 4:
                if(gun>=21){
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
                break;

            case 5:
                if(gun>=22){
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
                break;

            case 6:
                if(gun>=23){
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
                break;

            case 7:
                if(gun>=23){
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
                break;

            case 8:
                if(gun>=23){
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
                break;

            case 9:
                if(gun>=23){
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
                break;

            case 10:
                if(gun>=23){
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
                break;

            case 11:
                if(gun>=22){
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
                break;

            case 12:
                if(gun>=22){
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
                break;

            default:
                System.out.println("Lütfen ay için 1-12 arasında bir sayı giriniz. Gün için takvimden yardım alın. :)");
        }


        // IF ile ÇÖZÜM
        System.out.print("\n!!! IF İLE ÇÖZÜM !!!\n");

        System.out.print("Kaçıncı ayda doğdunuz ? : ");
        ay = input.nextInt();

        System.out.print("Ayın kaçında doğdunuz ? : ");
        gun = input.nextInt();

        if (ay == 1 && gun >= 22) {
            System.out.println("Kova Burcu");
        } else if (ay == 1){
            System.out.println("Oğlak Burcu");
        }

        if (ay == 2 && gun >= 20) {
            System.out.println("Balık Burcu");
        } else if (ay == 2){
            System.out.println("Kova Burcu");
        }

        if (ay == 3 && gun >= 21) {
            System.out.println("Koç Burcu");
        } else if (ay == 3){
            System.out.println("Balık Burcu");
        }

        if (ay == 4 && gun >= 21) {
            System.out.println("Boğa Burcu");
        } else if (ay == 4){
            System.out.println("Koç Burcu");
        }

        if (ay == 5 && gun >= 22) {
            System.out.println("ikizler Burcu");
        } else if (ay == 5){
            System.out.println("Boğa Burcu");
        }

        if (ay == 6 && gun >= 23) {
            System.out.println("Yengeç Burcu");
        } else if (ay == 6){
            System.out.println("ikizler Burcu");
        }

        if (ay == 7 && gun >= 23) {
            System.out.println("Aslan Burcu");
        } else if (ay == 7){
            System.out.println("yengeç Burcu");
        }

        if (ay == 8 && gun >= 23) {
            System.out.println("Başak Burcu");
        } else if (ay == 8){
            System.out.println("Aslan Burcu");
        }

        if (ay == 9 && gun >= 23) {
            System.out.println("Terazi Burcu");
        } else if (ay == 9){
            System.out.println("Başak Burcu");
        }

        if (ay == 10 && gun >= 20) {
            System.out.println("Akrep Burcu");
        } else if (ay == 10){
            System.out.println("Terazi Burcu");
        }

        if (ay == 11 && gun >= 20) {
            System.out.println("Yay Burcu");
        } else if (ay == 11){
            System.out.println("Akrep Burcu");
        }

        if (ay == 12 && gun >= 20) {
            System.out.println("Oğlak Burcu");
        } else if (ay == 12){
            System.out.println("Yay Burcu");
        }
    }
}
