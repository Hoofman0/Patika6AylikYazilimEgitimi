import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = k.nextInt();

        int a = 0, b = 1, c = 0;

        for (int i = 0; i < sayi; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}