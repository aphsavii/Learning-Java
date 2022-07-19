import java.util.Scanner;

public class _2D_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        for (int[] innerarray : arr) {
            for (int data : innerarray) {
                System.out.print(data+"  ");
            }
            System.out.println();
        }

    }
}
