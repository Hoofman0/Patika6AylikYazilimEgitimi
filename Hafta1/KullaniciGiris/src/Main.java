import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner k = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = k.nextLine();
        System.out.print("Şifreniz: ");
        password = k.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış ! Şifrenizi sıfırlamak ister misiniz ? (evet/hayır)");
            String secim = k.nextLine();
            if (secim.equals("evet")){
                System.out.print("Yeni Şifrenizi Giriniz:");
                String newPassword = k.nextLine();
                if (newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}