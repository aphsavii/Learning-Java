import java.util.Scanner;

public class _3D_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][][] arr = new int[2][3][2];

        // Arrray Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                    arr[i][j][j2] = input.nextInt();
                }
            }
        }
        input.close();
        
        // Array Printing
        System.out.println("Printing array :");
        for (int[][] outerarray : arr) {
            for (int[] innerarray : outerarray) {
                for (int data : innerarray) {
                    System.out.println(data);
                }
            }
        }
    }
}
