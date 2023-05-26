import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner k = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat = k.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz");
            System.out.println("Pikniğe gidebilirsiniz");
        } else if (heat < 10) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}