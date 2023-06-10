public class Main {

    static boolean isFind(int[] list, int value) {
        for (int i : list) {
            if (value % 2 == 0 && i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {11,7,8,8,10,3,4,10,8,9,6,17,4};
        int[] duplicate = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[i] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}