import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!!!");
        System.out.print("Lütfen oynamak istediğiniz satır sayısını giriniz : ");
        int rowNumber = scan.nextInt();
        System.out.print("Lütfen oynamak istediğiniz sütun sayısını giriniz : ");
        int colNumber = scan.nextInt();

        MineSweeper mine = new MineSweeper(rowNumber,colNumber);
        mine.run();
    }
}