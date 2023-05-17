import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int r, a;
        double pi = 3.14, alan, cevre, daireDilimiAlan;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = k.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = k.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        daireDilimiAlan = (pi * (r * r) * a) / 360;

        System.out.println("Daire dilimini alanı: " + daireDilimiAlan);
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);


    }
}