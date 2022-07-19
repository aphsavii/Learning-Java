package patterns;

import java.util.Scanner;

public class DecresingTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the pattern :");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}
