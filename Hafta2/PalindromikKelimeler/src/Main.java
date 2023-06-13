import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime giriniz : ");
        String kelime = input.nextLine();

        if (isPalindrome(kelime)) {
            System.out.println(kelime + " kelimesi palindromdur!");
        } else {
            System.out.println(kelime + " kelimesi palindrom değildir!");
        }

    }
}