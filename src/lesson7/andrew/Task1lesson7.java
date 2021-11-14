package lesson7.andrew;

public class Task1lesson7 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 1, 2},
                {3, 4, 5}};


        for(int i = 0;i < arr.length; i++){
            System.out.println();
            for (int k = 0 ; k < arr[i].length; k++){
                System.out.print(arr[i][k] +" ");
            }
        }
    }
}
