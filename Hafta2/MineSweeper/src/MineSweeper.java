import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {

    int rowNumber;
    int colNumber;
    String[][] mine;
    String[][] board;
    boolean isGame = true;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mine = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
    }

    void run() {
        System.out.println("Mayınların Konumu");
        mineCreation();
        print(mine);
        System.out.println("=============================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        int count = 0;

        while (isGame) {
            print(board);
            System.out.print("Satır giriniz : ");
            int row = scan.nextInt();
            System.out.print("Sütun giriniz : ");
            int col = scan.nextInt();

            if (row < rowNumber && col < colNumber) {
                if (!Objects.equals(mine[row][col], "*")) {
                    checkMine(row, col);
                    ++count;
                    if (count == (rowNumber * colNumber) - (rowNumber * colNumber / 4)) {
                        print(board);
                        System.out.println("Tebrikler oyunu kazandınız!!!");
                        break;
                    }

                } else {
                    isGame = false;
                    System.out.println("Oyun Bitti Kaybettiniz!!!");
                    System.out.println("Mayınların yeri şöyleydi");
                    print(mine);
                }
            } else {
                System.out.println("Lütfen dizi sınırlarında bir değer giriniz!!!");
                isGame = true;
            }

        }

    }

    void mineCreation() {
        int mineRow, mineCol;
        int count = 0;
        while (count < (rowNumber * colNumber) / 4) {
            mineRow = rand.nextInt(rowNumber);
            mineCol = rand.nextInt(colNumber);
            if (mine[mineRow][mineCol] != "*") {
                mine[mineRow][mineCol] = "*";
                count++;
            }
        }
    }

    public int checkMine(int row, int col) {
        int sum = 0;

        if (Objects.equals(mine[row][col], "-")) {
            if (col + 1 != colNumber) {
                if (Objects.equals(mine[row][col+1] , "*")) {
                    ++sum;
                }
            }

            if (col - 1 != -1) {
                if (Objects.equals(mine[row][col-1], "*")) {
                    ++sum;
                }
            }

            if (row + 1 != rowNumber ) {
                if (Objects.equals(mine[row+1][col], "*")) {
                    ++sum;
                }
            }

            if (row-1 != -1) {
                if (Objects.equals(mine[row-1][col], "*")) {
                    ++sum;
                }
            }

            if (col + 1 != colNumber && row + 1 != rowNumber) {
                if (Objects.equals(mine[row + 1][col+1] , "*")) {
                    ++sum;
                }
            }

            if (col - 1 != -1 && row - 1 != -1) {
                if (Objects.equals(mine[row - 1][col-1], "*")) {
                    ++sum;
                }
            }

            if (row + 1 != rowNumber && col - 1 != -1) {
                if (Objects.equals(mine[row + 1][col - 1], "*")) {
                    ++sum;
                }
            }

            if (row - 1 != -1 && col + 1 != colNumber) {
                if (Objects.equals(mine[row - 1][col + 1], "*")) {
                    ++sum;
                }
            }
        }

        board[row][col] = String.valueOf(sum);
        return sum;
    }

    void print(String[][] mine) {
        for (int i = 0; i < mine.length; i++) {
            for (int j = 0; j < mine[i].length; j++) {
                if (mine[i][j] == null) {
                    mine[i][j] = "-";
                }
                System.out.print(mine[i][j] + " ");
            }
            System.out.println();
        }
    }
}
