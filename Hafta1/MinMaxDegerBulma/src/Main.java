import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int deger = k.nextInt();
        int max = 0, min = 0;
        System.out.print("1. sayıyı giriniz : ");
        int sayi = k.nextInt();
        max = sayi;
        min = sayi;

        for (int i = 2; i <= deger; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            sayi = k.nextInt();
            if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}