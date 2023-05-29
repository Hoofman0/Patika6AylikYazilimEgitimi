import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi1, sayi2, i = 1;
        int ebob = 1, ekok = 1;
        System.out.print("Sayı Giriniz: ");
        sayi1 = k.nextInt();
        System.out.print("Sayı Giriniz: ");
        sayi2 = k.nextInt();

        if (sayi1 < sayi2) {
            while (i <= sayi1) {
                i++;
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
        } else if (sayi2 < sayi1) {
            while (i <= sayi2) {
                i++;
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
        } else {
            ebob = sayi1;
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Ebob Değeri : " + ebob);
        System.out.println("Ekok Değeri : " + ekok);
    }
}