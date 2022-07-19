// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Question2 {
    public static int sumOfOdds(int num) {
        int i = 0, sum = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sum = i + sum;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print sum of odds :");
        int num = input.nextInt();
        int sum = sumOfOdds(num);
        System.out.println("The sum of all odd numbers till" + num + " is :" + sum);
        input.close();
    }
}
