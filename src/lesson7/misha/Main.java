package lesson7.misha;

public class Main {
    public static void main(String[] args) {
        // 1,2,3,4,5

        //1 2 3 4
        //5 6 7 8
        //5 6 7 8

        int [][]  array = new int[3][3];
//        int [][]  array = {{0, 1, 2},
//                           {3, 4, 5}};
        array[1][2] = 7;
        System.out.println(array[1][2]);

        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
    }
}
