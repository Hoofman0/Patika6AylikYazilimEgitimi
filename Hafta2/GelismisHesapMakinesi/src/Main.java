import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int fak(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktöriyel Alma\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Toplam : " + sum(a, b));
                    break;
                case 2:
                    System.out.println("Çıkarma : " + minus(a, b));
                    break;
                case 3:
                    System.out.println("Çarpma : " + times(a, b));
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        System.out.println("İkinci sayı 0 dan farklı olmalı");
                    }
                    System.out.println("Bölüm : " + divided(a, b));
                    break;
                case 5:
                    System.out.println("Üs hesabı : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Faktöriyel Sonucu : " + fak(a));
                    break;
                case 7:
                    System.out.println("Mod işlemi : " + mod(a,b));
                    break;
                case 8:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }
        System.out.println("Güle Güle!");
    }
}