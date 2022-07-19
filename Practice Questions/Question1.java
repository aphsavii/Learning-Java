// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Question1 {
    public static float average(int a, int b, int c) {
        float avg = (float)(a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int num1 = input.nextInt();
        System.out.println("Enter the second Number :");
        int num2 = input.nextInt();
        System.out.println("Enter the third Number :");
        int num3 = input.nextInt();
        float average = average(num1, num2, num3);
        System.out.println("The average is :" + average);
        input.close();

    }
}
