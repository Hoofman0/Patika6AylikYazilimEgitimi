import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double boy, kilo, kitleIndeksi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = k.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = k.nextDouble();

        kitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + kitleIndeksi);
    }
}