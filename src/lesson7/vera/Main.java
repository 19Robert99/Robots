package lesson7.vera;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[][]
                {
                        {1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3}
                };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
    }
}
