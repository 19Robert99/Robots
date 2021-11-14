package lesson7;

import java.util.Arrays;

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
//        System.out.println(array[1][2]);

        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6}
                };
//        System.out.println(nums.length);
//        System.out.println(nums[0].length);


        int [] mas = {5, 4 ,1};//541
        int [] mas1 = {5, 3 ,1};//531

//        Arrays.sort(mas);
//        System.out.println(Arrays.toString(mas));
//
//        int [] masCopy = Arrays.copyOf(mas, 2);
        System.out.println(Arrays.toString(mas));

        System.out.println(Arrays.compare(mas, mas1));

    }
}
