import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz : ");
        int line = k.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz : ");
        int column = k.nextInt();

        int[][] matrix = new int[line][column];
        int[][] newMatrix = new int[column][line];

        // kullanıcının girdiği değerlere göre matris oluşturma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k.nextInt();
            }
        }

        System.out.println("Matris : ");

        //matrisi ekrana yazdırma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");

        //girilen matrisin transpoz işlemi
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        //transpozu alınan matrisi yazdırma
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length ; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}