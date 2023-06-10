public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double harmonicSeries = 0, harmonicAvarage;
        for (int numbers : list) {
            harmonicSeries += 1.0 / numbers;
        }
        harmonicAvarage = list.length / harmonicSeries;
        System.out.println("Dizideki sayıların harmonik ortalaması : " + harmonicAvarage);
    }
}