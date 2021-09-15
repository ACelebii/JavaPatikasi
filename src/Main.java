import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double anaPara , kdv , kdvli, kdv18 = 18, kdv8 = 8;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti Giriniz : ");
        anaPara = input.nextDouble();

        boolean kosul1 = anaPara >= 0;
        boolean kosul2 = anaPara <= 1000;
        boolean sonuc = kosul1 && kosul2;

        System.out.println("KDV'siz Fiyat : " + anaPara);

        kdv = sonuc ? kdv18 : kdv8;
        kdvli = anaPara + ((anaPara * kdv)/1000);

        System.out.println("KDV'li Fiyat : " + kdvli);
        System.out.println("KDV tutarı : " + kdv/10);
    }
}
