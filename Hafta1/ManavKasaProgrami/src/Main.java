import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;
        double toplamFiyat;

        System.out.print("Armut kilosunu giriniz: ");
        armutKilo = k.nextInt();

        System.out.print("Elma kilosunu giriniz: ");
        elmaKilo = k.nextInt();

        System.out.print("Domates kilosunu giriniz: ");
        domatesKilo = k.nextInt();

        System.out.print("Muz kilosunu giriniz: ");
        muzKilo = k.nextInt();

        System.out.print("Patlıcan kilosunu giriniz: ");
        patlicanKilo = k.nextInt();

        toplamFiyat = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) +
                (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam fiyat = " + toplamFiyat);


    }
}