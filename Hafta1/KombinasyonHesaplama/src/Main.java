import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n, r;
        double kombinasyon, fakN = 1, fakR = 1, fakNeksiR = 1;

        System.out.print("İlk sayıyı giriniz : ");
        n = k.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        r = k.nextInt();

        for (int i = 1; i <= n; i++) {//n! hesabı
            fakN *= i;
        }

        for (int i = 1; i <= r; i++) {//r! hesabı
            fakR *= i;
        }

        for (int i = 1; i <= (n-r) ; i++) {
            fakNeksiR *= i;
        }

        kombinasyon = fakN / (fakR * fakNeksiR);
        System.out.println(n + " ile " + r + " kombinasyonu sonucu : " + kombinasyon);
    }
}