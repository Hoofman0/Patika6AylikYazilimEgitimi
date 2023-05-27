import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int sayi;
        System.out.print("Sınır Sayısını Giriniz : ");
        sayi = k.nextInt();

        for (int i = 1; i <= sayi; i*=4) {
            System.out.println("4 ün kuvvetleri : " + i + " ");
        }

        for (int i = 1; i <= sayi; i*=5) {
            System.out.println("5 in kuvvetleri : " + i + " ");
        }
    }
}