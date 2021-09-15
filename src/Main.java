import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Değişkenleri oluştur
        double mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6 ;

        // Bulunan sonuç ekrana yazdırıldı.
        System.out.println("Ortalamanız = " + ortalama);
        boolean kosul1 = ortalama >= 60;
        System.out.println("Durum = " + (kosul1 == true ? "Geçti" : "Kaldı"));


    }
}
