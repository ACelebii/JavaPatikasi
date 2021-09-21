package Odevler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int elemanSay, sayi1= 0, sayi2=1, toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        elemanSay = input.nextInt();

        System.out.print(sayi1+" "+sayi2);

        for (int x = 2; x <= elemanSay; x++) {

            toplam=sayi1+sayi2;
            System.out.print(" "+toplam);

            sayi1=sayi2;
            sayi2=toplam;
        }
    }
}
