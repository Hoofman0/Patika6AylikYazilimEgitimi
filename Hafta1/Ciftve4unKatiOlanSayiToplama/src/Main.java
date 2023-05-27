import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi, toplam = 0;

        do {
            System.out.print("Sayı  giriniz : ");
            sayi = k.nextInt();
            if (sayi % 4 == 0) {//sayi % 2 == 0 && sayi % 4 == 0 
                toplam += sayi;
            }
        } while (sayi % 2 != 1);

        System.out.println("Çift ve 4 ün katı olan sayıların toplamı : " + toplam);
    }
}