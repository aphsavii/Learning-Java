package patterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern :");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}
