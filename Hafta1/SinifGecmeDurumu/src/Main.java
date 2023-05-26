import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, sayac = 0;

        Scanner k = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = k.nextDouble();
        if (mat < 0 || mat > 100){
            mat = 0;
        } else {
            sayac++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = k.nextDouble();
        if (fizik < 0 || fizik > 100){
            fizik = 0;
        } else {
            sayac++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = k.nextDouble();
        if (turkce < 0 || turkce > 100){
            turkce = 0;
        } else {
            sayac++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = k.nextDouble();
        if (kimya < 0 || kimya > 100){
            kimya = 0;
        } else {
            sayac++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = k.nextDouble();
        if (muzik < 0 || muzik > 100){
            muzik = 0;
        } else {
            sayac++;
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / sayac;
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız");
        } else {
            System.out.println("Sınıfı geçtiniz");
        }
        System.out.println("0 ila 100 arasında olan değerlerin ortalaması: " + avarage);
    }
}