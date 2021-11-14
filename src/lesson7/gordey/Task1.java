package lesson7.gordey;

public class Task1 {
    public static void main(String[] args) {

        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6}
                };
        for (int[] num : nums) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j] + " ");
            }
        }
    }
}
    

