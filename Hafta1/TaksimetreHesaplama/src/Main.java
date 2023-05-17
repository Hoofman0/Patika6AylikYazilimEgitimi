import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmBasiFiyat = 2.20, toplamFiyat = 0.0;
        int yol;

        Scanner k = new Scanner(System.in);

        System.out.print("Kaç km yol gidilecek: ");
        yol = k.nextInt();

        toplamFiyat = 10 + (yol * kmBasiFiyat);

        toplamFiyat = (toplamFiyat < 20) ? 20 : toplamFiyat;
        System.out.println("Ücret: " + toplamFiyat);


    }
}