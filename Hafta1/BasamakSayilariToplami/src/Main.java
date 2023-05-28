import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int sayi, basDerger, toplam = 0;
        System.out.print("Sayı giriniz : ");
        sayi = k.nextInt();

        while (sayi != 0) {
            basDerger = sayi % 10;
            toplam += basDerger;
            sayi /= 10;
        }

        System.out.println("Sayının basamak değerleri toplamı : " + toplam);
    }
}