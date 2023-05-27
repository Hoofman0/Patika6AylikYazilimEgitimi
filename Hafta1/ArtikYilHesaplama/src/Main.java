import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil = k.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır !");
                } else {
                    System.out.println(yil + " bir artık yıl değildir !");
                }
            } else {
                System.out.println(yil + " bir artık yıldır !");
            }
        } else {
            System.out.println(yil + " artık bir yıl değildir !");
        }
    }
}