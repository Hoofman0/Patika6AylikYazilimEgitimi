import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c, u, alan;

        Scanner k = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = k.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b = k.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + c);

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Alan: " + alan);

    }
}