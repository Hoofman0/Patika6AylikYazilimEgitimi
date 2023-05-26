import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int sayi1, sayi2, secim;

        System.out.print("1. sayıyı giriniz: ");
        sayi1 = k.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = k.nextInt();

        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        secim = k.nextInt();
        switch (secim){
            case 1:
                System.out.println("Toplama işleminin sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("Bölme işleminin sonucu: " + (sayi1 / sayi2));
                }
                else {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış bir seçenek yaptınız");
        }


    }
}