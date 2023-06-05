import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 0; i--) {
            for (int j = 1; j <= (basamakSayisi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}