import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int sayi, usDegeri, sonuc = 1;

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        sayi = k.nextInt();
        System.out.print("Üs değerini giriniz : ");
        usDegeri = k.nextInt();

        for (int i = 0; i < usDegeri; i++) {
            sonuc *= sayi;
        }

        System.out.println(sayi + " üzeri " + usDegeri + " : " + sonuc);
    }
}