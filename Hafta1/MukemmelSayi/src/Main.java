import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = k.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (sayi == toplam)
            System.out.println(sayi + " mükemmel sayıdır.");
        else
            System.out.println(sayi + " mükemmel sayı değildir.");
    }
}