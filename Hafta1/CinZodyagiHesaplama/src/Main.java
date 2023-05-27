import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int dogumYili, kalan;
        String cinZodyagi = "";

        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = k.nextInt();
        kalan = dogumYili % 12;

        switch (kalan) {
            case 0 -> cinZodyagi = "Maymun";
            case 1 -> cinZodyagi = "Horoz";
            case 2 -> cinZodyagi = "Köpek";
            case 3 -> cinZodyagi = "Domuz";
            case 4 -> cinZodyagi = "Fare";
            case 5 -> cinZodyagi = "Öküz";
            case 6 -> cinZodyagi = "Kaplan";
            case 7 -> cinZodyagi = "Tavşan";
            case 8 -> cinZodyagi = "Ejderha";
            case 9 -> cinZodyagi = "Yılan";
            case 10 -> cinZodyagi = "At";
            case 11 -> cinZodyagi = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }
}