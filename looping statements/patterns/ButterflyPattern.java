package patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter teh size of the pattern : ");
        int size = input.nextInt();
        input.close();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = size - 1; j > i; j--) {
                System.out.print("   ");
            }
            for (int j = size - 1; j > i; j--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" * ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = size; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
