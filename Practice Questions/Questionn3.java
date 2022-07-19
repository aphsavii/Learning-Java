// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Questionn3 {
    public static int greater() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = input.nextInt();
        System.out.println("Enter second number :");
        int num2 = input.nextInt();
        input.close();
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static void main(String[] args) {
        int temp = greater();
        System.out.println(temp + " is Greater ...");
    }
}
