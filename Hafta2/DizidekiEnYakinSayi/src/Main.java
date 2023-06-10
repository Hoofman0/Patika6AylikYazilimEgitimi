import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        int max = list[0], min = list[0];
        System.out.print("Sayı giriniz : ");
        int number = k.nextInt();

        int[] newList = {15,12,788,1,-1,-778,2,0,number};
        Arrays.sort(newList); //diziyi küçükten büyüğe sıralar

        //yeni dizide girilen sayının bir önceki indisindeki sayıyı yazdırır
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + newList[Arrays.binarySearch(newList,number) - 1]);
        //yeni dizide girilen sayının bir sonraki indisindeki sayıyı yazdırır
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + newList[Arrays.binarySearch(newList,number) + 1]);

    }
}
