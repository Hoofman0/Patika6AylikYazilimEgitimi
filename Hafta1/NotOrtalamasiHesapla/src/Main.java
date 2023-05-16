import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişken tanımlama
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner k = new Scanner(System.in);

        //kullanıcıdan veri alma kısmı

        System.out.print("Matemetik notunu giriniz: ");
        mat = k.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = k.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = k.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = k.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = k.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = k.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);

        System.out.println(sonuc > 60 ? "tebrikler sınıfı geçtiniz" : "üzgünüz sınıfta kaldınız");

    }
}