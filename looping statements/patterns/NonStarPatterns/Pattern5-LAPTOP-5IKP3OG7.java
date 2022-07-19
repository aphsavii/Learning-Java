//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

package patterns.NonStarPatterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the pattern : ");
        int size = input.nextInt();
        input.close();
        for (int i = 1; i <= size; i++) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print( " "+i);
            }
            System.out.println();
        }
    }
}
