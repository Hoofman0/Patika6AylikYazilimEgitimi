import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int size = k.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] list = new int[size];

        //Diziye kullanıcıdan aldığımız sayıları atıyoruz
        for (int i = 0; i < list.length; i++) {
            System.out.print((i+1) + " . Elemanı : ");
            int number = k.nextInt();
            list[i] = number;
        }

        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = (i+1); j < list.length; j++) {
                if (list[j] < list[i]) {   // bir sonraki indisteki sayı bir öncekinden küçükse
                    temp = list[i];       //yer değişimi yapacağımız için atamadan önce i indesindeki sayıyı koruyoruz
                    list[i] = list[j];   // küçük olanı öne
                    list[j] = temp;     // büyük olanı bir sonraki indise alıyoruz
                }
            }
        }

        //Sıralanmış diziyi yazdırma kısmı
        System.out.print("Sıralama : ");
        for (int numbers : list) {
            System.out.print(numbers + " ");
        }
    }
}