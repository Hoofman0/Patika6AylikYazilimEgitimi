import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafeKm, yas, yolculukTipi;
        double mesafeBasiUcret = 0.1, normalTutar, indirimliTutar, yasIndirimi, gidisDonusIndirimi, toplamTutar = 0;

        Scanner k = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        mesafeKm = k.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = k.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = k.nextInt();

        normalTutar = mesafeKm * mesafeBasiUcret;

        if (mesafeKm > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.5;
                indirimliTutar = normalTutar - yasIndirimi;
                if (yolculukTipi == 2) {
                    gidisDonusIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                }
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.1;
                indirimliTutar = normalTutar - yasIndirimi;
                if (yolculukTipi == 2) {
                    gidisDonusIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                }
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.3;
                indirimliTutar = normalTutar - yasIndirimi;
                if (yolculukTipi == 2) {
                    gidisDonusIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                }
            } else {
                toplamTutar = normalTutar;
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.println("Toplam tutar = " + toplamTutar);
    }
}