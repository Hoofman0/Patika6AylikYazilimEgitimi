import java.util.Scanner;

public class Main {

    static int us(int base, int above) {
        if (above == 0) {
            return 1;
        }
        if (above == 1) {
            return base;
        }
        return base * us(base, above - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int above = scan.nextInt();
        System.out.println(us(base, above));
    }
}