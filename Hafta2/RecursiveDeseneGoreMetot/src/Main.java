import java.util.Scanner;

public class Main {

    static void output(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            output(n - 5);
        }
        System.out.print(n + " ");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını : ");
        int n = scan.nextInt();
        System.out.print("Çıktısı : ");
        output(n);
    }
}