import java.util.Scanner;

public class Main {

    static int isPrime(int number, int i) {
        //i 1 olana kadar bölünme olmazsa 1 döndürecek
        if (i == 1) {
            return 1;
        } else {
            //herhangi bir bölme durumu olursa 0 döndürecek
            if (number % i == 0) {
                return 0;
            //olmazsa i bir azalacak ve tekrar bölme var mı bakılacak
            } else {
                return isPrime(number, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = scan.nextInt();

        //payda 0 olabilir bu yüzden try-catch kullandım
        try {
            int result = isPrime(number, number / 2);

            if (result == 1)
                System.out.println(number + " sayısı asaldır");
            else
                System.out.println(number + " sayısı asal değildir");

        }catch (Exception e) {
            System.out.println(number + " sayısı asal değildir");
        }
    }
}