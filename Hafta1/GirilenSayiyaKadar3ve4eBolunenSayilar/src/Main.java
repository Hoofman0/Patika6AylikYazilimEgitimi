import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int sayi,  sayac = 0;
        double ortalama, toplam = 0;

        System.out.print("Sayı Giriniz: ");
        sayi = k.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                sayac++;
            }
        }

        ortalama = toplam / sayac;
        System.out.println("3 ve 4 e bölünen sayıların ortalaması : " + ortalama);
    }
}