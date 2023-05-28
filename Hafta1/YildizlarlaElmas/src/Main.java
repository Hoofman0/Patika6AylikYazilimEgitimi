import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int sayi = s.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= (sayi-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = sayi-1; i >= 0; i--) {
            for (int j = 1; j <= (sayi-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}