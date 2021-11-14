package lesson7.kate;

public class Main {
    public static void main(String[] args) {
        int[][] valve = {{3, 7, 9}, {2,4,5},{4,8,9}};
        for (int i = 0; i < valve.length; i++){
            for (int j = 0; j < valve[i].length; j++) {
                System.out.println(valve[i] [j] + " \t ");
            }
            System.out.println();
        }
    }

}
