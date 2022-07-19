package patterns;

import java.util.Scanner;;

public class IncresingTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Pattern :");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}
